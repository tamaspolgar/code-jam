package com.menzus.gcj._2009.qualification.watersheds;

import com.menzus.gcj.common.OutputProducer;

public class WatershedsOutputProducer implements OutputProducer<WatershedsInput, WatershedsOutputEntry> {

    @Override
    public WatershedsOutputEntry produceOutput(WatershedsInput input) {
	char[][] basins = new char[input.getMap().length][input.getMap()[0].length];
	char basinId = 'a';
	while (hasUnprocessedBasin(basins)) {
	    int[] firstUndrainedPoint = getFirstUndrainedPoint(input.getMap(), basins);
	    if (drainMapAndCheckIfInNewBasin(input.getMap(), basins, firstUndrainedPoint, basinId)) {
		basinId++;
	    }
	}
	WatershedsOutputEntry outputEntry = new WatershedsOutputEntry();
	outputEntry.setBasins(basins);
	return outputEntry;
    }

    protected boolean drainMapAndCheckIfInNewBasin(int[][] map, char[][] basins, int[] startingPoint, char basinId) {
	int[] drainDirection = getFlowDirection(map, startingPoint);
	if (drainDirection != null) {
	    int newStartingPoint_X = startingPoint[0] + drainDirection[0];
	    int newStartingPoint_Y = startingPoint[1] + drainDirection[1];
	    if (!isBasinPointUndrained(basins[newStartingPoint_X][newStartingPoint_Y])) {
		basins[startingPoint[0]][startingPoint[1]] = basins[newStartingPoint_X][newStartingPoint_Y];
		return false;
	    } else {
		if (drainMapAndCheckIfInNewBasin(map, basins, new int[] { newStartingPoint_X, newStartingPoint_Y }, basinId)) {
		    basins[startingPoint[0]][startingPoint[1]] = basinId;		    
		    return true;
		} else {
		    basins[startingPoint[0]][startingPoint[1]] = basins[newStartingPoint_X][newStartingPoint_Y];
		    return false;
		}
	    }
	} else {
	    basins[startingPoint[0]][startingPoint[1]] = basinId;
	    return true;
	}
    }

    protected int[] getFlowDirection(int[][] map, int[] fromPoint) {
	int[] direction = null;
	int x = fromPoint[0];
	int y = fromPoint[1];
	int fromHeight = map[x][y];
	if (x != 0) {
	    if (map[x - 1][y] < fromHeight) {
		fromHeight = map[x - 1][y];
		direction = new int[] { -1, 0 };
	    }
	}
	if (y != 0) {
	    if (map[x][y - 1] < fromHeight) {
		fromHeight = map[x][y - 1];
		direction = new int[] { 0, -1 };
	    }
	}
	if (y != map[x].length - 1) {
	    if (map[x][y + 1] < fromHeight) {
		fromHeight = map[x][y + 1];
		direction = new int[] { 0, 1 };
	    }
	}
	if (x != map.length - 1) {
	    if (map[x + 1][y] < fromHeight) {
		fromHeight = map[x + 1][y];
		direction = new int[] { 1, 0 };
	    }
	}
	return direction;
    }

    protected int[] getFirstUndrainedPoint(int[][] map, char[][] basins) {	
	for (int i = 0; i < map.length; i++) {
	    for (int j = 0; j < map[i].length; j++) {
		if (isBasinPointUndrained(basins[i][j])) {
		    return new int[]{i,j};
		}
	    }
	}
	return null;
    }

    private boolean hasUnprocessedBasin(char[][] basins) {
	for (int i = 0; i < basins.length; i++) {
	    for (int j = 0; j < basins[i].length; j++) {
		if (isBasinPointUndrained(basins[i][j])) {
		    return true;
		}
	    }
	}
	return false;
    }

    private boolean isBasinPointUndrained(char basinPoint) {
	return basinPoint == 0;
    }
}

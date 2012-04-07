package com.menzus.gcj._2009.qualification.watersheds;

import java.util.Iterator;

import com.menzus.gcj.common.InputBlockParser;

public class WatershedsInputBlockParser implements InputBlockParser<WatershedsInput> {
    @Override
    public WatershedsInput parseLineIterator(Iterator<String> lineIterator) {
	String firstLine = lineIterator.next();
	String[] dimensions = firstLine.split(" ");
	int height = Integer.parseInt(dimensions[0]);
	int[][] map = new int[height][];
	for (int i = 0; i < height; i++) {
	    String mapLine = lineIterator.next();
	    String[] rowElementsString = mapLine.split(" ");
	    map[i] = new int[rowElementsString.length];
	    for (int j = 0; j < rowElementsString.length; j++) {
		map[i][j] = Integer.parseInt(rowElementsString[j]);
	    }
	}
	WatershedsInput input = new WatershedsInput();
	input.setMap(map);
	return input;
    }
}

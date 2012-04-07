package com.menzus.gcj._2009.qualification.watersheds;

import com.menzus.gcj.common.OutputEntry;

public class WatershedsOutputEntry implements OutputEntry {
    private char[][] basins;

    public void setBasins(char[][] basins) {
	this.basins = basins;
    }

    @Override
    public String formatOutput() {
	StringBuilder builder = new StringBuilder("\n");
	for (int i = 0; i < basins.length; i++) {
	    for (int j = 0; j < basins[i].length; j++) {
		builder.append(basins[i][j]);
		if (j < basins[i].length - 1) {
		    builder.append(' ');
		}
	    }
	    if (i < basins.length - 1) {
		builder.append('\n');
	    }
	}
	return builder.toString();
    }
}

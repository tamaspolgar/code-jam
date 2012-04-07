package com.menzus.gcj._2008.round1a.milkshakes;

import com.menzus.gcj.common.OutputEntry;

public class MilkshakesOutput implements OutputEntry {
    private boolean[] milkshakes;

    public MilkshakesOutput(boolean[] milkshakes) {
	this.milkshakes = milkshakes;
    }

    @Override
    public String formatOutput() {
	if (milkshakes == null) {
	    return "IMPOSSIBLE";
	}
	StringBuilder output = new StringBuilder();
	for (int i = 0; i < milkshakes.length; i++) {
	    if (milkshakes[i]) {
		output.append("1");
	    } else {
		output.append("0");
	    }
	    if (i < milkshakes.length - 1) {
		output.append(" ");		
	    }
	}
	return output.toString();
    }
}

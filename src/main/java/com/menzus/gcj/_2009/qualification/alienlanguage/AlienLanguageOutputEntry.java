package com.menzus.gcj._2009.qualification.alienlanguage;

import com.menzus.gcj.common.OutputEntry;

public class AlienLanguageOutputEntry implements OutputEntry {
    private int matches;

    public AlienLanguageOutputEntry(int matches) {
	this.matches = matches;
    }

    @Override
    public String formatOutput() {
	return Integer.toString(matches);
    }
}

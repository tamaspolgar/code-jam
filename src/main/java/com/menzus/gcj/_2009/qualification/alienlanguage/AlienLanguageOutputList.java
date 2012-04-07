package com.menzus.gcj._2009.qualification.alienlanguage;

import java.util.List;

import com.menzus.gcj.common.OutputList;

public class AlienLanguageOutputList implements OutputList<AlienLanguageOutputEntry> {
    private List<AlienLanguageOutputEntry> outputEntries;

    @Override
    public List<AlienLanguageOutputEntry> getOutputEntries() {
	return outputEntries;
    }

    public void setOutputEntries(List<AlienLanguageOutputEntry> outputEntries) {
	this.outputEntries = outputEntries;
    }
}

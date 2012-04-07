package com.menzus.gcj._2009.qualification.alienlanguage;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import com.menzus.gcj.common.OutputProducer;

public class AlienLanguageOutputProducer implements OutputProducer<AlienLanguageInput, AlienLanguageOutputList> {
    @Override
    public AlienLanguageOutputList produceOutput(AlienLanguageInput input) {
	List<AlienLanguageOutputEntry> outputEntries = new LinkedList<AlienLanguageOutputEntry>();
	for (String pattern : input.getPatterns()) {
	    outputEntries.add(produceOutputEntry(pattern, input.getWords()));
	}
	AlienLanguageOutputList outputList = new AlienLanguageOutputList();
	outputList.setOutputEntries(outputEntries);
	return outputList;
    }

    private AlienLanguageOutputEntry produceOutputEntry(String pattern, List<String> words) {
	int matches = 0;
	String regexp = transformPatternToRegexp(pattern);
	for (String word : words) {
	    if (Pattern.matches(regexp, word)) {
		matches++;
	    }
	}
	return new AlienLanguageOutputEntry(matches);
    }

    private String transformPatternToRegexp(String pattern) {
	return pattern.replace('(', '[').replace(')', ']');
    }
}

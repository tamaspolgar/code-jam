package com.menzus.gcj._2009.qualification.alienlanguage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.menzus.gcj.common.InputBlockParser;

public class AlienLanguageInputBlockParser implements InputBlockParser<AlienLanguageInput> {
    @Override
    public AlienLanguageInput parseLineIterator(Iterator<String> lineIterator) {
	AlienLanguageInput alienLanguageInput = new AlienLanguageInput();
	String firstLine = lineIterator.next();
	String[] firstLineParts = firstLine.split(" ");

	int wordsNumber = Integer.parseInt(firstLineParts[1]);
	List<String> words = new LinkedList<String>();
	for (int i = 0; i < wordsNumber; i++) {
	    words.add(lineIterator.next());
	}
	alienLanguageInput.setWords(words);

	int patternsNumber = Integer.parseInt(firstLineParts[2]);
	List<String> patterns = new LinkedList<String>();
	for (int i = 0; i < patternsNumber; i++) {
	    patterns.add(lineIterator.next());
	}
	alienLanguageInput.setPatterns(patterns);

	return alienLanguageInput;
    }
}

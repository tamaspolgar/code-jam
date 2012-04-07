package com.menzus.gcj._2009.qualification.alienlanguage;

import java.util.List;

import com.menzus.gcj.common.Input;

public class AlienLanguageInput implements Input {
    private List<String> words;
    private List<String> patterns;

    public List<String> getWords() {
	return words;
    }

    public void setWords(List<String> words) {
	this.words = words;
    }

    public List<String> getPatterns() {
	return patterns;
    }

    public void setPatterns(List<String> patterns) {
	this.patterns = patterns;
    }
}

package com.menzus.gcj._2009.qualification.welcome;

import java.util.Iterator;

import com.menzus.gcj.common.InputBlockParser;

public class WelcomeInputBlockParser implements InputBlockParser<WelcomeInput> {
    @Override
    public WelcomeInput parseLineIterator(Iterator<String> lineIterator) {
	String inputLine = lineIterator.next();
	WelcomeInput input = new WelcomeInput();
	input.setInputLine(inputLine);
	return input;
    }
}

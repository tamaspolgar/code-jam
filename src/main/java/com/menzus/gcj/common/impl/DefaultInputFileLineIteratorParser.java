package com.menzus.gcj.common.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.menzus.gcj.common.Input;
import com.menzus.gcj.common.InputBlockParser;
import com.menzus.gcj.common.InputFileLineIteratorParser;

public class DefaultInputFileLineIteratorParser<T extends Input> implements InputFileLineIteratorParser<T> {

    protected InputBlockParser<T> inputBlockParser;
    protected int totalCaseNumber;
    protected int currentBlockIndex;

    public void setInputBlockParser(InputBlockParser<T> inputBlockParser) {
	this.inputBlockParser = inputBlockParser;
    }

    @Override
    public List<T> parseInputFileLineIterator(Iterator<String> lineIterator) {
	List<T> inputs = new LinkedList<T>();
	readTotalCaseNumber(lineIterator);
	for (currentBlockIndex = 0; currentBlockIndex < totalCaseNumber; currentBlockIndex++) {
	    T inputBlock = inputBlockParser.parseLineIterator(lineIterator);
	    inputs.add(inputBlock);
	}
	return inputs;
    }

    private void readTotalCaseNumber(Iterator<String> lineIterator) {
	String totalCaseNumberString = lineIterator.next();
	this.totalCaseNumber = Integer.parseInt(totalCaseNumberString);
    }
}

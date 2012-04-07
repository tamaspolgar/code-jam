package com.menzus.gcj._2008.round1a.minimumscalarproduct;


import java.util.Iterator;

import com.menzus.gcj.common.InputBlockParser;

public class MinimalScalarProductInputBlockParser implements InputBlockParser<MinimalScalarProductInput> {

    @Override
    public MinimalScalarProductInput parseLineIterator(Iterator<String> lineIterator) {
	lineIterator.next();
	String xVectorStringLine = lineIterator.next();
	String yVectorStringLine = lineIterator.next();
	int[] xVector = parseXVectorStringLine(xVectorStringLine);
	int[] yVector = parseYVectorStringLine(yVectorStringLine);
	return new MinimalScalarProductInput(xVector, yVector);
    }

    private int[] parseXVectorStringLine(String xVectorStringLine) {
	return parseVectorStringLine(xVectorStringLine);
    }

    private int[] parseYVectorStringLine(String yVectorStringLine) {
	return parseVectorStringLine(yVectorStringLine);
    }

    private int[] parseVectorStringLine(String vectorStringLine) {
	String[] numberStrings = vectorStringLine.split(" ");
	int[] parsedVector = new int[numberStrings.length];
	for (int i = 0; i < numberStrings.length; i++) {
	    parsedVector[i] = Integer.parseInt(numberStrings[i]);
	}
	return parsedVector;
    }
}

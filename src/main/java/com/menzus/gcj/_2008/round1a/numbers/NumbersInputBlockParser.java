package com.menzus.gcj._2008.round1a.numbers;

import java.util.Iterator;

import com.menzus.gcj.common.InputBlockParser;

public class NumbersInputBlockParser implements InputBlockParser<NumbersInput> {
    @Override
    public NumbersInput parseLineIterator(Iterator<String> lineIterator) {
	String nString = lineIterator.next();
	return new NumbersInput(Integer.parseInt(nString));
    }
}

package com.menzus.gcj._2012.qualification.b;

import java.util.Iterator;

import com.menzus.gcj.common.InputBlockParser;

public class BInputBlockParser implements InputBlockParser<BInput> {
    @Override
    public BInput parseLineIterator(Iterator<String> lineIterator) {
	BInput input = new BInput();
	return input;
    }
}

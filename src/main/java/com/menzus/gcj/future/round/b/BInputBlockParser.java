package com.menzus.gcj.future.round.b;

import java.util.Iterator;

import com.menzus.gcj.common.InputBlockParser;

public class BInputBlockParser implements InputBlockParser<BInput> {
    @Override
    public BInput parseLineIterator(Iterator<String> lineIterator) {
	BInput input = new BInput();
	return input;
    }
}

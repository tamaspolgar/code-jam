package com.menzus.gcj._2012.qualification.a;

import java.util.Iterator;

import com.menzus.gcj.common.InputBlockParser;

public class AInputBlockParser implements InputBlockParser<AInput> {
    @Override
    public AInput parseLineIterator(Iterator<String> lineIterator) {
	AInput input = new AInput();
	return input;
    }
}

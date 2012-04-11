package com.menzus.gcj._2012.qualification.c;

import java.util.Iterator;

import com.menzus.gcj.common.InputBlockParser;

public class CInputBlockParser implements InputBlockParser<CInput> {
    @Override
    public CInput parseLineIterator(Iterator<String> lineIterator) {
	CInput input = new CInput();
	return input;
    }
}

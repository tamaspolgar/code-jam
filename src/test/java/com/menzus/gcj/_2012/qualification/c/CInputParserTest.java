package com.menzus.gcj._2012.qualification.c;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class CInputParserTest {
    private CInputBlockParser inputBlockParser;

    @Before
    public void before() {
	inputBlockParser = new CInputBlockParser();
    }

    @Test
    public void givenTest1() {
	Iterator<String> lineIterator = Arrays.asList("").iterator();
	
	CInput input = inputBlockParser.parseLineIterator(lineIterator);
	
//	Assert
    }

}

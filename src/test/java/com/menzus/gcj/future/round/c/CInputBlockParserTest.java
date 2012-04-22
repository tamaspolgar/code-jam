package com.menzus.gcj.future.round.c;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CInputBlockParserTest {
    private CInputBlockParser inputBlockParser;

    @Before
    public void before() {
	inputBlockParser = new CInputBlockParser();
    }
    
    @Test
    public void givenTest1 () {
	Iterator<String> lineIterator = Arrays.asList("").iterator();
	
	CInput input = inputBlockParser.parseLineIterator(lineIterator);
	
	Assert.assertNotNull(input);
    }
}

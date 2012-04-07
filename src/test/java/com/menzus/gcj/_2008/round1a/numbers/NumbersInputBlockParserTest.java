package com.menzus.gcj._2008.round1a.numbers;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumbersInputBlockParserTest {
    private NumbersInputBlockParser numbersInputBlockParser;

    @Before
    public void before() {
	numbersInputBlockParser = new NumbersInputBlockParser();
    }

    @Test
    public void parseLineIterator() {
	Iterator<String> lineIterator = Arrays.asList("30").iterator();
	
	NumbersInput numbersInput = numbersInputBlockParser.parseLineIterator(lineIterator);
	
	Assert.assertEquals(30, numbersInput.getN());
    }
}

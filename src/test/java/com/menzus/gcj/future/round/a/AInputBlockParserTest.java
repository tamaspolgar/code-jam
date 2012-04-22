package com.menzus.gcj.future.round.a;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AInputBlockParserTest {
    private AInputBlockParser inputBlockParser;

    @Before
    public void before() {
	inputBlockParser = new AInputBlockParser();
    }

    @Test
    public void givenTest1() {
	Iterator<String> lineIterator = Arrays.asList("").iterator();

	AInput input = inputBlockParser.parseLineIterator(lineIterator);

	Assert.assertNotNull(input);
    }
}

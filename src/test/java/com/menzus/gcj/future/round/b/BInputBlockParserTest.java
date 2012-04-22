package com.menzus.gcj.future.round.b;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BInputBlockParserTest {
    private BInputBlockParser inputBlockParser;

    @Before
    public void before() {
	inputBlockParser = new BInputBlockParser();
    }

    @Test
    public void givenTest1() {
	Iterator<String> lineIterator = Arrays.asList("").iterator();

	BInput input = inputBlockParser.parseLineIterator(lineIterator);

	Assert.assertNotNull(input);
    }
}

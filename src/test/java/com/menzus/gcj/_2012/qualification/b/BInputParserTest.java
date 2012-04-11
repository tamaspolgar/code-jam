package com.menzus.gcj._2012.qualification.b;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class BInputParserTest {
    private BInputBlockParser inputBlockParser;

    @Before
    public void before() {
	inputBlockParser = new BInputBlockParser();
    }

    @Test
    public void givenTest1() {
	Iterator<String> lineIterator = Arrays.asList("").iterator();

	BInput input = inputBlockParser.parseLineIterator(lineIterator);

	// Assert
    }

}

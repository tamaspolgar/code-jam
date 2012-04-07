package com.menzus.gcj._2009.qualification.welcome;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WelcomeInputBlockParserTest {
    private WelcomeInputBlockParser inputBlockParser;

    @Before
    public void before() {
	inputBlockParser = new WelcomeInputBlockParser();
    }
    
    @Test
    public void givenTest1() {
	Iterator<String> lineIterator = Arrays.asList("line0").iterator();
	WelcomeInput input = inputBlockParser.parseLineIterator(lineIterator);
	Assert.assertEquals("line0", input.getInputLine());
    }
}

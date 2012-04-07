package com.menzus.gcj._2009.qualification.alienlanguage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlienLanguageInputBlockParserTest {
    private AlienLanguageInputBlockParser blockParser;

    @Before
    public void before() {
	blockParser = new AlienLanguageInputBlockParser();
    }

    @Test
    public void parseLineIterator() {
	Iterator<String> lineIterator = Arrays.asList("3 5 4", "abc", "bca", "dac", "dbc", "cba", "(ab)(bc)(ca)",
		"abc", "(abc)(abc)(abc)", "(zyx)bc").iterator();

	AlienLanguageInput input = blockParser.parseLineIterator(lineIterator);

	List<String> expectedWords = Arrays.asList("abc", "bca", "dac", "dbc", "cba");
	Assert.assertEquals(expectedWords, input.getWords());

	List<String> expectedPatterns = Arrays.asList("(ab)(bc)(ca)", "abc", "(abc)(abc)(abc)", "(zyx)bc");
	Assert.assertEquals(expectedPatterns, input.getPatterns());
    }
}

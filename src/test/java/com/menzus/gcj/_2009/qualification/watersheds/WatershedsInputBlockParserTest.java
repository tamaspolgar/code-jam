package com.menzus.gcj._2009.qualification.watersheds;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WatershedsInputBlockParserTest {
    private WatershedsInputBlockParser inputBlockParser;

    @Before
    public void before() {
	inputBlockParser = new WatershedsInputBlockParser();
    }

    @Test
    public void givenTest1() {
	Iterator<String> lineIterator = Arrays.asList("3 3", "9 6 3", "5 9 6", "3 5 9").iterator();

	WatershedsInput input = inputBlockParser.parseLineIterator(lineIterator);

	Assert.assertEquals(3, input.getMap().length);
	Assert.assertArrayEquals(new int[] { 9, 6, 3 }, input.getMap()[0]);
	Assert.assertArrayEquals(new int[] { 5, 9, 6 }, input.getMap()[1]);
	Assert.assertArrayEquals(new int[] { 3, 5, 9 }, input.getMap()[2]);
    }

    @Test
    public void givenTest2() {
	Iterator<String> lineIterator = Arrays.asList("1 10", "0 1 2 3 4 5 6 7 8 7").iterator();

	WatershedsInput input = inputBlockParser.parseLineIterator(lineIterator);

	Assert.assertEquals(1, input.getMap().length);
	Assert.assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 7 }, input.getMap()[0]);
    }
}

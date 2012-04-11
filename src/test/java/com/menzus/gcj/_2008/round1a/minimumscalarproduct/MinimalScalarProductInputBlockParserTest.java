package com.menzus.gcj._2008.round1a.minimumscalarproduct;


import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.menzus.gcj._2008.round1a.minimumscalarproduct.MinimalScalarProductInput;
import com.menzus.gcj._2008.round1a.minimumscalarproduct.MinimalScalarProductInputBlockParser;

public class MinimalScalarProductInputBlockParserTest {
    private MinimalScalarProductInputBlockParser parser;

    @Before
    public void before() {
	parser = new MinimalScalarProductInputBlockParser();
    }
    
    @Test
    public void parseOneLengthVectors () {
	Iterator<String> lineIterator = Arrays.asList("1", "2", "3").iterator();
	MinimalScalarProductInput integerVectorPair = parser.parseLineIterator(lineIterator);
	
	Assert.assertArrayEquals(new int[]{2}, integerVectorPair.getXVector());
	Assert.assertArrayEquals(new int[]{3}, integerVectorPair.getYVector());
    }
    
    @Test
    public void parseLongerVectors () {
	Iterator<String> lineIterator = Arrays.asList("1", "2 4 6 8 10", "3 5 7 9 11").iterator();
	MinimalScalarProductInput integerVectorPair = parser.parseLineIterator(lineIterator);
	
	Assert.assertArrayEquals(new int[]{2, 4, 6, 8, 10}, integerVectorPair.getXVector());
	Assert.assertArrayEquals(new int[]{3, 5, 7, 9, 11}, integerVectorPair.getYVector());
    }
}

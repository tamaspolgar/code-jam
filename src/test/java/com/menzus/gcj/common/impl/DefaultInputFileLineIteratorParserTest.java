package com.menzus.gcj.common.impl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.menzus.gcj.common.Input;
import com.menzus.gcj.common.InputBlockParser;

public class DefaultInputFileLineIteratorParserTest {
    private DefaultInputFileLineIteratorParser<Input> parser;

    @Mock
    private InputBlockParser<Input> inputBlockParser;

    @Before
    public void before() {
	MockitoAnnotations.initMocks(this);
	parser = new DefaultInputFileLineIteratorParser<Input>();
	parser.setInputBlockParser(inputBlockParser);
    }

    @Test
    public void parseInputFileLineIterator() {
	Iterator<String> inputFileLineIterator = Arrays.asList("2").iterator();
	Input input0 = Mockito.mock(Input.class);
	Input input1 = Mockito.mock(Input.class);
	Mockito.when(inputBlockParser.parseLineIterator(inputFileLineIterator)).thenReturn(input0).thenReturn(input1);

	List<Input> inputs = parser.parseInputFileLineIterator(inputFileLineIterator);

	Assert.assertEquals(2, inputs.size());
	Assert.assertTrue(input0 == inputs.get(0));
	Assert.assertTrue(input1 == inputs.get(1));
    }
}

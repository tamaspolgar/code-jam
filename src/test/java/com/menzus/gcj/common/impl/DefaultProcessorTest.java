package com.menzus.gcj.common.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.menzus.gcj.common.Input;
import com.menzus.gcj.common.InputFileLineIteratorParser;
import com.menzus.gcj.common.InputFileLoader;
import com.menzus.gcj.common.LineIteratorTransformer;
import com.menzus.gcj.common.Output;
import com.menzus.gcj.common.OutputListProducer;
import com.menzus.gcj.common.OutputListWriter;

public class DefaultProcessorTest {

    private DefaultProcessor<Input, Output> processor;

    @Mock
    private InputFileLoader inputFileLoader;

    @Mock
    private LineIteratorTransformer lineIteratorTransformer;

    @Mock
    private InputFileLineIteratorParser<Input> inputFileLineIteratorParser;

    @Mock
    private OutputListProducer<Input, Output> outputListProducer;

    @Mock
    private OutputListWriter<Output> outputListWriter;

    @Before
    public void before() {
	MockitoAnnotations.initMocks(this);
	processor = new DefaultProcessor<Input, Output>();
	processor.setInputFileLoader(inputFileLoader);
	processor.setLineIteratorTransformer(lineIteratorTransformer);
	processor.setInputFileLineIteratorParser(inputFileLineIteratorParser);
	processor.setOutputListProducer(outputListProducer);
	processor.setOutputListWriter(outputListWriter);
    }

    @Test
    public void process() throws Exception {
	Iterator<String> iterator = Arrays.asList("").iterator();
	Mockito.when(inputFileLoader.getLineIterator()).thenReturn(iterator);

	Iterator<String> transformedIterator = new ArrayList<String>().iterator();
	Mockito.when(lineIteratorTransformer.transform(iterator)).thenReturn(transformedIterator);

	List<Input> inputs = new ArrayList<Input>();
	Mockito.when(inputFileLineIteratorParser.parseInputFileLineIterator(transformedIterator)).thenReturn(inputs);

	List<Output> outputs = new ArrayList<Output>();
	Mockito.when(outputListProducer.produceOutputs(inputs)).thenReturn(outputs);

	processor.process();

	Mockito.verify(outputListWriter).writeOutputList(outputs);
    }

    @Test(expected = IllegalStateException.class)
    public void processWithException() throws Exception {
	Mockito.when(inputFileLoader.getLineIterator()).thenThrow(new IOException());

	processor.process();
    }
}

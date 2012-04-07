package com.menzus.gcj.common.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.menzus.gcj.common.Input;
import com.menzus.gcj.common.InputBlockParser;
import com.menzus.gcj.common.Output;
import com.menzus.gcj.common.OutputProducer;

public class AbstractProcessorFactoryTest {
    private AbstractProcessorFactory<Input, Output> abstractProcessorFactory;

    @Mock
    private OutputProducer<Input, Output> outputProducer;

    @Mock
    private InputBlockParser<Input> inputBlockParser;

    @Before
    public void before() {
	abstractProcessorFactory = new AbstractProcessorFactory<Input, Output>("inputFileName") {

	    @Override
	    protected OutputProducer<Input, Output> createOutputProducer() {
		return outputProducer;
	    }

	    @Override
	    protected InputBlockParser<Input> createInputBlockParser() {
		return inputBlockParser;
	    }
	};
    }

    @Test
    public void createProcessor() {
	@SuppressWarnings("unchecked")
	DefaultProcessor<Input, Output> processor = (DefaultProcessor<Input, Output>) abstractProcessorFactory
		.createProcessor();

	DefaultInputFileLineIteratorParser<Input> inputFileLineIteratorParser = (DefaultInputFileLineIteratorParser<Input>) processor.inputFileLineIteratorParser;
	Assert.assertEquals(inputBlockParser, inputFileLineIteratorParser.inputBlockParser);

	DefaultInputFileLoader inputFileLoader = (DefaultInputFileLoader) processor.inputFileLoader;
	Assert.assertEquals("inputFileName", inputFileLoader.fileName);
	
	Assert.assertTrue(processor.lineIteratorTransformer instanceof DefaultLineIteratorTransformer);
	
	DefaultOutputListProducer<Input, Output> listProducer = (DefaultOutputListProducer<Input, Output>)processor.outputListProducer;
	Assert.assertEquals(outputProducer, listProducer.outputProducer);
	
	DefaultOutputListWriter<Output> outputListWriter = (DefaultOutputListWriter<Output>)processor.outputListWriter;
	Assert.assertEquals("inputFileName.out", outputListWriter.fileName);
    }
}

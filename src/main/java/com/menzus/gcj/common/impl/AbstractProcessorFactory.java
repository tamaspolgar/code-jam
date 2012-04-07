package com.menzus.gcj.common.impl;

import com.menzus.gcj.common.Input;
import com.menzus.gcj.common.InputBlockParser;
import com.menzus.gcj.common.InputFileLoader;
import com.menzus.gcj.common.InputFileLineIteratorParser;
import com.menzus.gcj.common.LineIteratorTransformer;
import com.menzus.gcj.common.Output;
import com.menzus.gcj.common.OutputListProducer;
import com.menzus.gcj.common.OutputListWriter;
import com.menzus.gcj.common.OutputProducer;
import com.menzus.gcj.common.Processor;
import com.menzus.gcj.common.ProcessorFactory;

public abstract class AbstractProcessorFactory<I extends Input, O extends Output> implements ProcessorFactory {
    private String inputFileName;
    
    public AbstractProcessorFactory(String inputFileName) {
	this.inputFileName = inputFileName;
    }
    
    @Override
    public Processor createProcessor() {
	DefaultProcessor<I, O> processor = new DefaultProcessor<I, O>();
	processor.setInputFileLoader(createInputFileLoader());
	processor.setInputFileLineIteratorParser(createInputFileLineIteratorParser());
	processor.setLineIteratorTransformer(createLineIteratorTransformer());
	processor.setOutputListWriter(createOutputListWriter());
	processor.setOutputListProducer(createOutputListProducer());
	return processor;
    }

    protected InputFileLoader createInputFileLoader() {
	DefaultInputFileLoader inputFileLoader = new DefaultInputFileLoader();
	inputFileLoader.setFileName(getInputFileName());
	return inputFileLoader;
    }

    protected InputFileLineIteratorParser<I> createInputFileLineIteratorParser() {
	DefaultInputFileLineIteratorParser<I> inputFileLineIteratorParser = new DefaultInputFileLineIteratorParser<I>();
	inputFileLineIteratorParser.setInputBlockParser(createInputBlockParser());
	return inputFileLineIteratorParser;
    }

    protected LineIteratorTransformer createLineIteratorTransformer() {
	return new DefaultLineIteratorTransformer();
    }

    protected OutputListWriter<O> createOutputListWriter() {
	DefaultOutputListWriter<O> outputListWriter = new DefaultOutputListWriter<O>();
	outputListWriter.setFileName(getOutputFileName());
	return outputListWriter;
    }

    protected OutputListProducer<I, O> createOutputListProducer() {
	DefaultOutputListProducer<I, O> outputListProducer = new DefaultOutputListProducer<I, O>();
	outputListProducer.setOutputProducer(createOutputProducer());
	return outputListProducer;
    }
    
    protected String getInputFileName() {
	return inputFileName;
    }

    protected String getOutputFileName() {
	return getInputFileName() + ".out";
    }

    protected abstract InputBlockParser<I> createInputBlockParser();
    protected abstract OutputProducer<I, O> createOutputProducer();
}

package com.menzus.gcj.common.impl;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.menzus.gcj.common.Input;
import com.menzus.gcj.common.InputFileLoader;
import com.menzus.gcj.common.InputFileLineIteratorParser;
import com.menzus.gcj.common.LineIteratorTransformer;
import com.menzus.gcj.common.Output;
import com.menzus.gcj.common.OutputListProducer;
import com.menzus.gcj.common.OutputListWriter;
import com.menzus.gcj.common.Processor;

public class DefaultProcessor<I extends Input, O extends Output> implements Processor {

    protected OutputListProducer<I, O> outputListProducer;
    protected InputFileLineIteratorParser<I> inputFileLineIteratorParser;
    protected InputFileLoader inputFileLoader;
    protected OutputListWriter<O> outputListWriter;
    protected LineIteratorTransformer lineIteratorTransformer;

    public void setOutputListProducer(OutputListProducer<I, O> outputListProducer) {
	this.outputListProducer = outputListProducer;
    }

    public void setInputFileLineIteratorParser(InputFileLineIteratorParser<I> inputFileLineIteratorParser) {
	this.inputFileLineIteratorParser = inputFileLineIteratorParser;
    }

    public void setInputFileLoader(InputFileLoader inputFileLoader) {
	this.inputFileLoader = inputFileLoader;
    }

    public void setOutputListWriter(OutputListWriter<O> outputListWriter) {
	this.outputListWriter = outputListWriter;
    }

    public void setLineIteratorTransformer(LineIteratorTransformer lineIteratorTransformer) {
	this.lineIteratorTransformer = lineIteratorTransformer;
    }

    @Override
    public void process() {
	try {
	    Iterator<String> lineIterator = inputFileLoader.getLineIterator();
	    Iterator<String> transformedLineIterator = lineIteratorTransformer.transform(lineIterator);
	    List<I> inputs = inputFileLineIteratorParser.parseInputFileLineIterator(transformedLineIterator);
	    List<O> outputs = outputListProducer.produceOutputs(inputs);
	    outputListWriter.writeOutputList(outputs);
	} catch (IOException e) {
	    throw new IllegalStateException(e);
	}
    }
}

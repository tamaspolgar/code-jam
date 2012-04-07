package com.menzus.gcj._2008.round1a.numbers;

import com.menzus.gcj.common.InputBlockParser;
import com.menzus.gcj.common.OutputProducer;
import com.menzus.gcj.common.impl.AbstractProcessorFactory;

public class NumbersProcessorFactory extends AbstractProcessorFactory<NumbersInput, NumbersOutput> {
    public NumbersProcessorFactory(String inputFileName) {
	super(inputFileName);
    }

    @Override
    protected InputBlockParser<NumbersInput> createInputBlockParser() {
	return new NumbersInputBlockParser();
    }

    @Override
    protected OutputProducer<NumbersInput, NumbersOutput> createOutputProducer() {
	return new NumbersOutputProducer();
    }
}

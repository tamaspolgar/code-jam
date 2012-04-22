package com.menzus.gcj.future.round.a;

import com.menzus.gcj.common.InputBlockParser;
import com.menzus.gcj.common.OutputProducer;
import com.menzus.gcj.common.impl.AbstractProcessorFactory;

public class AProcessorFactory extends AbstractProcessorFactory<AInput, AOutputEntry> {
    public AProcessorFactory(String inputFileName) {
	super(inputFileName);
    }

    @Override
    protected InputBlockParser<AInput> createInputBlockParser() {
	return new AInputBlockParser();
    }

    @Override
    protected OutputProducer<AInput, AOutputEntry> createOutputProducer() {
	return new AOutputProducer();
    }
}

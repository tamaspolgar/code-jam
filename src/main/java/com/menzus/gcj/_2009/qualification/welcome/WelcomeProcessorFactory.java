package com.menzus.gcj._2009.qualification.welcome;

import com.menzus.gcj.common.InputBlockParser;
import com.menzus.gcj.common.OutputProducer;
import com.menzus.gcj.common.impl.AbstractProcessorFactory;

public class WelcomeProcessorFactory extends AbstractProcessorFactory<WelcomeInput, WelcomeOutputEntry> {
    public WelcomeProcessorFactory(String inputFileName) {
	super(inputFileName);
    }

    @Override
    protected InputBlockParser<WelcomeInput> createInputBlockParser() {
	return new WelcomeInputBlockParser();
    }

    @Override
    protected OutputProducer<WelcomeInput, WelcomeOutputEntry> createOutputProducer() {
	return new WelcomeOutputProducer();
    }
}

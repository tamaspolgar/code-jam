package com.menzus.gcj._2008.round1a.milkshakes;

import com.menzus.gcj.common.InputBlockParser;
import com.menzus.gcj.common.OutputProducer;
import com.menzus.gcj.common.impl.AbstractProcessorFactory;


public class MilkshakesProcessorFactory extends AbstractProcessorFactory<MilkshakesInput, MilkshakesOutput> {
    
    public MilkshakesProcessorFactory(String inputFileName) {
	super(inputFileName);
    }
    
    @Override
    protected InputBlockParser<MilkshakesInput> createInputBlockParser() {
	return new MilkshakesInputBlockParser();
    }

    @Override
    protected OutputProducer<MilkshakesInput, MilkshakesOutput> createOutputProducer() {
	return new MilkshakesOutputProducer();
    }
}

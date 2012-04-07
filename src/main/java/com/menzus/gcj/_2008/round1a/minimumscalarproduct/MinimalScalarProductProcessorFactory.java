package com.menzus.gcj._2008.round1a.minimumscalarproduct;

import com.menzus.gcj.common.InputBlockParser;
import com.menzus.gcj.common.OutputProducer;
import com.menzus.gcj.common.impl.AbstractProcessorFactory;


public class MinimalScalarProductProcessorFactory extends
	AbstractProcessorFactory<MinimalScalarProductInput, MinimalScalarProductOutput> {
    
    public MinimalScalarProductProcessorFactory(String inputFileName) {
	super(inputFileName);
    }
    
    @Override
    protected InputBlockParser<MinimalScalarProductInput> createInputBlockParser() {
	return new MinimalScalarProductInputBlockParser();
    }

    @Override
    protected OutputProducer<MinimalScalarProductInput, MinimalScalarProductOutput> createOutputProducer() {
	return new MinimalScalarProductOutputProducer();
    }
}

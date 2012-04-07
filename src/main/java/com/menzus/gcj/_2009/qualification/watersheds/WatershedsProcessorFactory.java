package com.menzus.gcj._2009.qualification.watersheds;

import com.menzus.gcj.common.InputBlockParser;
import com.menzus.gcj.common.OutputProducer;
import com.menzus.gcj.common.impl.AbstractProcessorFactory;

public class WatershedsProcessorFactory extends AbstractProcessorFactory<WatershedsInput, WatershedsOutputEntry> {
    public WatershedsProcessorFactory(String inputFileName) {
	super(inputFileName);
    }

    @Override
    protected InputBlockParser<WatershedsInput> createInputBlockParser() {
	return new WatershedsInputBlockParser();
    }

    @Override
    protected OutputProducer<WatershedsInput, WatershedsOutputEntry> createOutputProducer() {
	return new WatershedsOutputProducer();
    }
}

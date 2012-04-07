package com.menzus.gcj._2009.qualification.alienlanguage;

import com.menzus.gcj.common.InputBlockParser;
import com.menzus.gcj.common.LineIteratorTransformer;
import com.menzus.gcj.common.OutputProducer;
import com.menzus.gcj.common.impl.AbstractProcessorFactory;

public class AlienLanguageProcessorFactory extends
	AbstractProcessorFactory<AlienLanguageInput, AlienLanguageOutputList> {

    public AlienLanguageProcessorFactory(String inputFileName) {
	super(inputFileName);
    }

    @Override
    protected InputBlockParser<AlienLanguageInput> createInputBlockParser() {
	return new AlienLanguageInputBlockParser();
    }

    @Override
    protected OutputProducer<AlienLanguageInput, AlienLanguageOutputList> createOutputProducer() {
	return new AlienLanguageOutputProducer();
    }

    @Override
    protected LineIteratorTransformer createLineIteratorTransformer() {
	return new AlienLanguageLineIteratorTransformer();
    }

}

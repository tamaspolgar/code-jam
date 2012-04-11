package com.menzus.gcj._2012.qualification.b;

import com.menzus.gcj.common.OutputProducer;

public class BOutputProducer implements OutputProducer<BInput, BOutputEntry> {

    @Override
    public BOutputEntry produceOutput(BInput input) {
	BOutputEntry outputEntry = new BOutputEntry();
	return outputEntry;
    }
}

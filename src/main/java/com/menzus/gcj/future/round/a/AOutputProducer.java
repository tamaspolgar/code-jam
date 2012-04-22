package com.menzus.gcj.future.round.a;

import com.menzus.gcj.common.OutputProducer;

public class AOutputProducer implements OutputProducer<AInput, AOutputEntry> {

    @Override
    public AOutputEntry produceOutput(AInput input) {
	AOutputEntry outputEntry = new AOutputEntry();
	return outputEntry;
    }
}

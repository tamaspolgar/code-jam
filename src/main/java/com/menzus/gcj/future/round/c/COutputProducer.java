package com.menzus.gcj.future.round.c;

import com.menzus.gcj.common.OutputProducer;

public class COutputProducer implements OutputProducer<CInput, COutputEntry> {

    @Override
    public COutputEntry produceOutput(CInput input) {
	COutputEntry outputEntry = new COutputEntry();
	return outputEntry;
    }
}

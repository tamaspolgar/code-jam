package com.menzus.gcj.common.impl;


import java.util.LinkedList;
import java.util.List;

import com.menzus.gcj.common.Input;
import com.menzus.gcj.common.Output;
import com.menzus.gcj.common.OutputListProducer;
import com.menzus.gcj.common.OutputProducer;

public class DefaultOutputListProducer<I extends Input, O extends Output> implements OutputListProducer<I, O> {
    
    protected OutputProducer<I, O> outputProducer;
    
    public void setOutputProducer(OutputProducer<I, O> outputProducer) {
	this.outputProducer = outputProducer;
    }
    
    @Override
    public List<O> produceOutputs(List<I> inputs) {
	List<O> outputs = new LinkedList<O>();
	for (I input : inputs) {
	    outputs.add(outputProducer.produceOutput(input));
	}
	return outputs;
    }
}

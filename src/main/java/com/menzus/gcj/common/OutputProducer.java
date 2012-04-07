package com.menzus.gcj.common;

public interface OutputProducer<I extends Input, O extends Output> {
    O produceOutput(I input);
}

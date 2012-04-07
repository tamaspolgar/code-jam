package com.menzus.gcj.common;

import java.util.List;

public interface OutputListProducer<I extends Input, O extends Output> {
    List<O> produceOutputs(List<I> inputs);
}

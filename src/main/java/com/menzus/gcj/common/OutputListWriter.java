package com.menzus.gcj.common;

import java.io.IOException;
import java.util.List;

public interface OutputListWriter<O extends Output> {
    void writeOutputList(List<O> outputs) throws IOException;
}

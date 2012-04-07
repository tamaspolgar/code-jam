package com.menzus.gcj.common;

import java.util.List;

public interface OutputList<O extends OutputEntry> extends Output {
    List<O> getOutputEntries();
}

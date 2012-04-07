package com.menzus.gcj.common;

import java.util.Iterator;
import java.util.List;

public interface InputFileLineIteratorParser<T extends Input> {
    List<T> parseInputFileLineIterator(Iterator<String> lineIterator);
}

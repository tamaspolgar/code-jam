package com.menzus.gcj.common;

import java.util.Iterator;

public interface InputBlockParser<T extends Input> {
    T parseLineIterator(Iterator<String> lineIterator);
}

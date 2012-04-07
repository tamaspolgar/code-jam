package com.menzus.gcj.common;

import java.util.Iterator;

public interface LineIteratorTransformer {
    Iterator<String> transform(Iterator<String> lineIterator);
}

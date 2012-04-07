package com.menzus.gcj.common.impl;


import java.util.Iterator;

import com.menzus.gcj.common.LineIteratorTransformer;

public class DefaultLineIteratorTransformer implements LineIteratorTransformer {
    
    @Override
    public Iterator<String> transform(Iterator<String> lineIterator) {
	return lineIterator;
    }
}

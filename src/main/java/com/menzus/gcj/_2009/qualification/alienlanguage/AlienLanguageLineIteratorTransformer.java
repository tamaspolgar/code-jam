package com.menzus.gcj._2009.qualification.alienlanguage;

import java.util.ArrayList;
import java.util.Iterator;

import com.menzus.gcj.common.LineIteratorTransformer;

public class AlienLanguageLineIteratorTransformer implements LineIteratorTransformer {
    @Override
    public Iterator<String> transform(Iterator<String> lineIterator) {
	ArrayList<String> transformedList = new ArrayList<String>();
	transformedList.add("1");
	while (lineIterator.hasNext()) {
	    transformedList.add(lineIterator.next());
	}
	return transformedList.iterator();
    }
}

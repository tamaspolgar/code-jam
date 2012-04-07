package com.menzus.gcj.common.impl;

import java.util.ArrayList;
import java.util.Iterator;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class DefaultLineIteratorTransformerTest {
    private DefaultLineIteratorTransformer transformer;

    @Before
    public void before() {
	transformer = new DefaultLineIteratorTransformer();
    }

    @Test
    public void transform() {
	Iterator<String> iterator = new ArrayList<String>().iterator();

	Iterator<String> transformedIterator = transformer.transform(iterator);

	Assert.assertEquals(iterator, transformedIterator);
    }
}

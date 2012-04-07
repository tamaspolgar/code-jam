package com.menzus.gcj._2009.qualification.alienlanguage;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlienLanguageLineIteratorTransformerTest {
    private AlienLanguageLineIteratorTransformer lineIteratorTransformer;

    @Before
    public void before() {
	lineIteratorTransformer = new AlienLanguageLineIteratorTransformer();
    }

    @Test
    public void transform() {
	Iterator<String> iterator = Arrays.asList("line0", "line1").iterator();
	Iterator<String> transformedIterator = lineIteratorTransformer.transform(iterator);

	Assert.assertEquals("1", transformedIterator.next());
	Assert.assertEquals("line0", transformedIterator.next());
	Assert.assertEquals("line1", transformedIterator.next());
	Assert.assertFalse(transformedIterator.hasNext());
    }
}

package com.menzus.gcj.common.impl;

import java.io.IOException;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultInputFileLoaderTest {
    private static final String INPUT_FILE_NAME = "src/test/resources/com/menzus/gcj/common/impl/defaultInputFileLoaderTestInput.txt";
    private static final String NOT_EXISTING_FILE_NAME = "not-existing-file.txt";

    private DefaultInputFileLoader inputFileLoader;

    @Before
    public void before() {
	inputFileLoader = new DefaultInputFileLoader();
    }

    @Test
    public void getLineIterator() throws IOException {
	inputFileLoader.setFileName(INPUT_FILE_NAME);

	Iterator<String> iterator = inputFileLoader.getLineIterator();

	String line0 = iterator.next();
	Assert.assertEquals("line0", line0);

	String line1 = iterator.next();
	Assert.assertEquals("line1", line1);

	Assert.assertFalse(iterator.hasNext());
    }

    @Test(expected = IOException.class)
    public void getLineIteratorWithNotExistingFile() throws IOException {
	inputFileLoader.setFileName(NOT_EXISTING_FILE_NAME);

	inputFileLoader.getLineIterator();
    }
}

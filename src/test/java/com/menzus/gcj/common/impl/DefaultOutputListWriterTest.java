package com.menzus.gcj.common.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.menzus.gcj.common.Output;
import com.menzus.gcj.common.OutputEntry;
import com.menzus.gcj.common.OutputList;

public class DefaultOutputListWriterTest {

    private static final String OUTPUT_FILE_NAME = "src/test/resources/com/menzus/gcj/common/impl/defaultOutputListWriterTestOutput.txt";
    private static final String UNCREATEABL_OUTPUT_FILE_NAME = "not-existing-folder/uncreatableOutput.txt";
    private DefaultOutputListWriter<Output> outputListWriter;

    @Before
    public void before() {
	outputListWriter = new DefaultOutputListWriter<Output>();
    }

    @Test
    public void writeOutputList() throws IOException {
	deleteOutputIfExists();

	outputListWriter.setFileName(OUTPUT_FILE_NAME);
	OutputEntry output0 = Mockito.mock(OutputEntry.class);
	Mockito.when(output0.formatOutput()).thenReturn("output0");
	
	@SuppressWarnings("unchecked")
	OutputList<OutputEntry> outputList = Mockito.mock(OutputList.class);
	OutputEntry output1 = Mockito.mock(OutputEntry.class);
	Mockito.when(output1.formatOutput()).thenReturn("output1");
	OutputEntry output2 = Mockito.mock(OutputEntry.class);
	Mockito.when(output2.formatOutput()).thenReturn("output2");
	List<OutputEntry> outputEntries = Arrays.asList(output1,output2);
	Mockito.when(outputList.getOutputEntries()).thenReturn(outputEntries);

	OutputEntry output3 = Mockito.mock(OutputEntry.class);
	Mockito.when(output3.formatOutput()).thenReturn("output3");
	List<Output> outputs = new ArrayList<Output>();
	outputs.add(output0);
	outputs.add(outputList);
	outputs.add(output3);

	outputListWriter.writeOutputList(outputs);

	assertOutputFile();
    }

    @Test(expected=IOException.class)
    public void writeOutputListNotCreateableFile() throws IOException {
	outputListWriter.setFileName(UNCREATEABL_OUTPUT_FILE_NAME);
	List<Output> outputs = Arrays.asList();

	outputListWriter.writeOutputList(outputs);
    }

    private void assertOutputFile() throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader(OUTPUT_FILE_NAME));
	String line0 = bufferedReader.readLine();
	Assert.assertEquals("Case #1: output0", line0);

	String line1 = bufferedReader.readLine();
	Assert.assertEquals("Case #2: output1", line1);

	String line2 = bufferedReader.readLine();
	Assert.assertEquals("Case #3: output2", line2);

	String line3 = bufferedReader.readLine();
	Assert.assertEquals("Case #4: output3", line3);

	String line4 = bufferedReader.readLine();
	Assert.assertNull(line4);
    }

    private void deleteOutputIfExists() {
	File file = new File(OUTPUT_FILE_NAME);
	if (file.exists()) {
	    file.delete();
	}
    }
}

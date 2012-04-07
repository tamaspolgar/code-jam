package com.menzus.gcj.common.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.menzus.gcj.common.Output;
import com.menzus.gcj.common.OutputEntry;
import com.menzus.gcj.common.OutputList;
import com.menzus.gcj.common.OutputListWriter;

public class DefaultOutputListWriter<O extends Output> implements OutputListWriter<O> {

    protected String fileName;

    public void setFileName(String fileName) {
	this.fileName = fileName;
    }

    @Override
    public void writeOutputList(List<O> outputs) throws IOException {
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
	try {
	    int i = 1;
	    for (O output : outputs) {
		if (output instanceof OutputEntry) {
		    OutputEntry outputEntry = (OutputEntry) output;
		    String formattedOutput = "Case #" + i++ + ": " + outputEntry.formatOutput();
		    bufferedWriter.write(formattedOutput);
		    bufferedWriter.newLine();
		} else if (output instanceof OutputList<?>) {
		    OutputList<?> outputList = (OutputList<?>) output;
		    List<? extends OutputEntry> outputEntries = outputList.getOutputEntries();
		    for (OutputEntry outputEntry : outputEntries) {
			String formattedOutput = "Case #" + i++ + ": " + outputEntry.formatOutput();
			bufferedWriter.write(formattedOutput);
			bufferedWriter.newLine();
		    }
		}
	    }
	} finally {
	    bufferedWriter.close();
	}
    }
}

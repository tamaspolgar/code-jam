package com.menzus.gcj.common.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.menzus.gcj.common.InputFileLoader;

public class DefaultInputFileLoader implements InputFileLoader {

    protected String fileName;

    public void setFileName(String fileName) {
	this.fileName = fileName;
    }

    @Override
    public Iterator<String> getLineIterator() throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
	try {
	    List<String> lineList = new LinkedList<String>();
	    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
		lineList.add(line);
	    }
	    return lineList.iterator();
	} finally {
	    bufferedReader.close();
	}
    }
}

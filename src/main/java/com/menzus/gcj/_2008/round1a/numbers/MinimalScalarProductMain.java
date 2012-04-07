package com.menzus.gcj._2008.round1a.numbers;

import com.menzus.gcj.common.Processor;

public class MinimalScalarProductMain {

    private static String SMALL_FILE_NAME = "src/main/resources/com/menzus/gcj/_2008/round1a/numbers/C-small-practice.in.txt";
    private static String LARGE_FILE_NAME = "src/main/resources/com/menzus/gcj/_2008/round1a/numbers/C-large-practice.in.txt";

    public static void main(String[] args) {
	Processor smallFileProcessor = new NumbersProcessorFactory(SMALL_FILE_NAME).createProcessor();
	smallFileProcessor.process();

	Processor largeFileProcessor = new NumbersProcessorFactory(LARGE_FILE_NAME).createProcessor();
	largeFileProcessor.process();
	
	System.out.println("done.");
    }
}

package com.menzus.gcj.future.round.a;

import com.menzus.gcj.common.Processor;

public class AMain {

    private static String SMALL_FILE_NAME = "src/main/resources/com/menzus/gcj/_2011/round1a/a/A-small-practice.in.txt";
    private static String LARGE_FILE_NAME = "src/main/resources/com/menzus/gcj/_2011/round1a/a/A-large-practice.in.txt";

    public static void main(String[] args) {
	Processor smallFileProcessor = new AProcessorFactory(SMALL_FILE_NAME).createProcessor();
	smallFileProcessor.process();
	
	Processor largeFileProcessor = new AProcessorFactory(LARGE_FILE_NAME).createProcessor();
	largeFileProcessor.process();
    }
}

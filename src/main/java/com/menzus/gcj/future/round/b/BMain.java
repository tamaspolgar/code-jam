package com.menzus.gcj.future.round.b;

import com.menzus.gcj.common.Processor;

public class BMain {

    private static String SMALL_FILE_NAME = "src/main/resources/com/menzus/gcj/_2011/round1a/b/B-small-practice.in.txt";
    private static String LARGE_FILE_NAME = "src/main/resources/com/menzus/gcj/_2011/round1a/b/B-large-practice.in.txt";

    public static void main(String[] args) {
	Processor smallFileProcessor = new BProcessorFactory(SMALL_FILE_NAME).createProcessor();
	smallFileProcessor.process();
	
	Processor largeFileProcessor = new BProcessorFactory(LARGE_FILE_NAME).createProcessor();
	largeFileProcessor.process();
    }
}

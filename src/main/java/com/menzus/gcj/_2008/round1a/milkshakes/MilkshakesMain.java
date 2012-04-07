package com.menzus.gcj._2008.round1a.milkshakes;

import com.menzus.gcj.common.Processor;

public class MilkshakesMain {

    private static String SMALL_FILE_NAME = "src/main/resources/com/menzus/gcj/_2008/round1a/milkshakes/B-small-practice.in.txt";
    private static String LARGE_FILE_NAME = "src/main/resources/com/menzus/gcj/_2008/round1a/milkshakes/B-large-practice.in.txt";

    public static void main(String[] args) throws Exception {
	Processor smallFileProcessor = new MilkshakesProcessorFactory(SMALL_FILE_NAME).createProcessor();
	smallFileProcessor.process();

	Processor largeFileProcessor = new MilkshakesProcessorFactory(LARGE_FILE_NAME).createProcessor();
	largeFileProcessor.process();

	System.out.println("done.");
    }
}

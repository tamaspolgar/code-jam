package com.menzus.gcj._2012.qualification.b;

import com.menzus.gcj.common.Processor;

public class BMain {

    private static String SMALL_FILE_NAME = "src/main/resources/com/menzus/gcj/_2012/qualification/b/B-small-practice.in.txt";
    private static String LARGE_FILE_NAME = "src/main/resources/com/menzus/gcj/_2012/qualification/b/B-large-practice.in.txt";

    public static void main(String[] args) throws Exception {
	Processor smallFileProcessor = new BProcessorFactory(SMALL_FILE_NAME).createProcessor();
	smallFileProcessor.process();

	Processor largeFileProcessor = new BProcessorFactory(LARGE_FILE_NAME).createProcessor();
	largeFileProcessor.process();

	System.out.println("done.");
    }
}

package com.menzus.gcj._2012.qualification.a;

import com.menzus.gcj.common.Processor;

public class AMain {

    private static String SMALL_FILE_NAME = "src/main/resources/com/menzus/gcj/_2012/qualification/a/A-small-practice.in.txt";
    private static String LARGE_FILE_NAME = "src/main/resources/com/menzus/gcj/_2012/qualification/a/A-large-practice.in.txt";

    public static void main(String[] args) throws Exception {
	Processor smallFileProcessor = new AProcessorFactory(SMALL_FILE_NAME).createProcessor();
	smallFileProcessor.process();

	Processor largeFileProcessor = new AProcessorFactory(LARGE_FILE_NAME).createProcessor();
	largeFileProcessor.process();

	System.out.println("done.");
    }
}

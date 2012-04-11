package com.menzus.gcj._2012.qualification.c;

import com.menzus.gcj.common.Processor;

public class CMain {

    private static String SMALL_FILE_NAME = "src/main/resources/com/menzus/gcj/_2012/qualification/c/C-small-practice.in.txt";
    private static String LARGE_FILE_NAME = "src/main/resources/com/menzus/gcj/_2012/qualification/c/C-large-practice.in.txt";

    public static void main(String[] args) throws Exception {
	Processor smallFileProcessor = new CProcessorFactory(SMALL_FILE_NAME).createProcessor();
	smallFileProcessor.process();

	Processor largeFileProcessor = new CProcessorFactory(LARGE_FILE_NAME).createProcessor();
	largeFileProcessor.process();

	System.out.println("done.");
    }
}

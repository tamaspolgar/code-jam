package com.menzus.gcj._2009.qualification.welcome;

import com.menzus.gcj.common.Processor;

public class WelcomeMain {

    private static String SMALL_FILE_NAME = "src/main/resources/com/menzus/gcj/_2009/qualification/welcome/C-small-practice.in.txt";
    private static String LARGE_FILE_NAME = "src/main/resources/com/menzus/gcj/_2009/qualification/welcome/C-large-practice.in.txt";

    public static void main(String[] args) throws Exception {
	Processor smallFileProcessor = new WelcomeProcessorFactory(SMALL_FILE_NAME).createProcessor();
	smallFileProcessor.process();

	Processor largeFileProcessor = new WelcomeProcessorFactory(LARGE_FILE_NAME).createProcessor();
	largeFileProcessor.process();

	System.out.println("done.");
    }
}

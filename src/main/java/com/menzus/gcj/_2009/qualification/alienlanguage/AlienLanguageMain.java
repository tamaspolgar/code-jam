package com.menzus.gcj._2009.qualification.alienlanguage;

import com.menzus.gcj.common.Processor;

public class AlienLanguageMain {

    private static String SMALL_FILE_NAME = "src/main/resources/com/menzus/gcj/_2009/qualification/alienlanguage/A-small-practice.in.txt";
    private static String LARGE_FILE_NAME = "src/main/resources/com/menzus/gcj/_2009/qualification/alienlanguage/A-large-practice.in.txt";

    public static void main(String[] args) throws Exception {
	Processor smallFileProcessor = new AlienLanguageProcessorFactory(SMALL_FILE_NAME).createProcessor();
	smallFileProcessor.process();

	Processor largeFileProcessor = new AlienLanguageProcessorFactory(LARGE_FILE_NAME).createProcessor();
	largeFileProcessor.process();

	System.out.println("done.");
    }
}

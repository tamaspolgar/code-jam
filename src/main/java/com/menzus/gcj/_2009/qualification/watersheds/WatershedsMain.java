package com.menzus.gcj._2009.qualification.watersheds;

import com.menzus.gcj.common.Processor;

public class WatershedsMain {

    private static String SMALL_FILE_NAME = "src/main/resources/com/menzus/gcj/_2009/qualification/watersheds/B-small-practice.in.txt";
    private static String LARGE_FILE_NAME = "src/main/resources/com/menzus/gcj/_2009/qualification/watersheds/B-large-practice.in.txt";

    public static void main(String[] args) throws Exception {
	Processor smallFileProcessor = new WatershedsProcessorFactory(SMALL_FILE_NAME).createProcessor();
	smallFileProcessor.process();

	Processor largeFileProcessor = new WatershedsProcessorFactory(LARGE_FILE_NAME).createProcessor();
	largeFileProcessor.process();

	System.out.println("done.");
    }
}

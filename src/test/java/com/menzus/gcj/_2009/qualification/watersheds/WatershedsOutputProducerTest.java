package com.menzus.gcj._2009.qualification.watersheds;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class WatershedsOutputProducerTest {
    private WatershedsOutputProducer outputProducer;

    @Before
    public void before() {
	outputProducer = new WatershedsOutputProducer();
    }

    @Test
    public void givenTest1() {
	WatershedsInput input = new WatershedsInput();
	input.setMap(new int[][] { { 9, 6, 3 }, { 5, 9, 6 }, { 3, 5, 9 } });

	WatershedsOutputEntry output = outputProducer.produceOutput(input);

	String expectedOutput = "\n" + "a b b\n" + "a a b\n" + "a a a";
	Assert.assertEquals(expectedOutput, output.formatOutput());
    }

    @Test
    public void givenTest2() {
	WatershedsInput input = new WatershedsInput();
	input.setMap(new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 7 } });

	WatershedsOutputEntry output = outputProducer.produceOutput(input);

	String expectedOutput = "\na a a a a a a a a b";
	Assert.assertEquals(expectedOutput, output.formatOutput());
    }

    @Test
    public void givenTest3() {
	WatershedsInput input = new WatershedsInput();
	input.setMap(new int[][] { { 7, 6, 7 }, { 7, 6, 7 } });

	WatershedsOutputEntry output = outputProducer.produceOutput(input);

	String expectedOutput = "\n" + "a a a\n" + "b b b";
	Assert.assertEquals(expectedOutput, output.formatOutput());
    }

    @Test
    public void givenTest4() {
	WatershedsInput input = new WatershedsInput();
	input.setMap(new int[][] { { 1, 2, 3, 4, 5 }, { 2, 9, 3, 9, 6 }, { 3, 3, 0, 8, 7 }, { 4, 9, 8, 9, 8 },
		{ 5, 6, 7, 8, 9 } });

	WatershedsOutputEntry output = outputProducer.produceOutput(input);

	String expectedOutput = "\na a a a a\na a b b a\na b b b a\na b b b a\na a a a a";
	Assert.assertEquals(expectedOutput, output.formatOutput());
    }

    @Test
    public void givenTest5() {
	WatershedsInput input = new WatershedsInput();
	input.setMap(new int[][] { { 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, { 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 } });

	WatershedsOutputEntry output = outputProducer.produceOutput(input);

	String expectedOutput = "\na b c d e f g h i j k l m\nn o p q r s t u v w x y z";
	Assert.assertEquals(expectedOutput, output.formatOutput());
    }
}

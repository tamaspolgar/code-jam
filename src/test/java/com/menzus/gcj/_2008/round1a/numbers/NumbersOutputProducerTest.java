package com.menzus.gcj._2008.round1a.numbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumbersOutputProducerTest {
    private NumbersOutputProducer numbersOutputProducer;

    @Before
    public void before() {
	numbersOutputProducer = new NumbersOutputProducer();
    }
    
    @Test
    public void givenTest1() {
	NumbersInput numbersInput = new NumbersInput(5);
	NumbersOutput numbersOutput = numbersOutputProducer.produceOutput(numbersInput);
	Assert.assertEquals("935", numbersOutput.formatOutput());
    }
    
    @Test
    public void givenTest2() {
	NumbersInput numbersInput = new NumbersInput(2);
	NumbersOutput numbersOutput = numbersOutputProducer.produceOutput(numbersInput);
	Assert.assertEquals("027", numbersOutput.formatOutput());
    }
}

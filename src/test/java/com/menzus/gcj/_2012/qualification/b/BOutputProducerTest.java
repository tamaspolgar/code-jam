package com.menzus.gcj._2012.qualification.b;

import org.junit.Before;
import org.junit.Test;

public class BOutputProducerTest {
    private BOutputProducer outputProducer;

    @Before
    public void before() {
	outputProducer = new BOutputProducer();
    }

    @Test
    public void givenTest1() {
	BInput input = new BInput();

	BOutputEntry outputEntry = outputProducer.produceOutput(input);

	// Assert
    }
}

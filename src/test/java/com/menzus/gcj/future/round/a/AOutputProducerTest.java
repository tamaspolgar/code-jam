package com.menzus.gcj.future.round.a;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AOutputProducerTest {
    private AOutputProducer outputProducer;

    @Before
    public void before() {
	outputProducer = new AOutputProducer();
    }

    @Test
    public void givenTest1() {
	AInput input = new AInput();

	AOutputEntry outputEntry = outputProducer.produceOutput(input);

	Assert.assertNotNull(outputEntry);
    }
}

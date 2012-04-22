package com.menzus.gcj.future.round.b;

import org.junit.Assert;
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

	Assert.assertNotNull(outputEntry);
    }
}

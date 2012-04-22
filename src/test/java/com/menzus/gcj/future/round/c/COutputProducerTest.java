package com.menzus.gcj.future.round.c;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class COutputProducerTest {
    private COutputProducer outputProducer;
    
    @Before
    public void before() {
	outputProducer = new COutputProducer();	
    }
    
    @Test
    public void givenTest1() {
	CInput input = new CInput();
	
	COutputEntry outputEntry = outputProducer.produceOutput(input);
	
	Assert.assertNotNull(outputEntry);
    }
}

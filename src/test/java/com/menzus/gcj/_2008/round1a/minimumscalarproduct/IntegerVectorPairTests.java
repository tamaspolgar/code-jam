package com.menzus.gcj._2008.round1a.minimumscalarproduct;


import org.junit.Assert;
import org.junit.Test;

import com.menzus.gcj._2008.round1a.minimumscalarproduct.MinimalScalarProductInput;
import com.menzus.gcj._2008.round1a.minimumscalarproduct.MinimalScalarProductOutputProducer;

public class IntegerVectorPairTests {

    @Test
    public void providedTest1() {
	int[] xVector = { 1, 3, -5 };
	int[] yVector = { -2, 4, 1 };
	MinimalScalarProductInput integerVectorPair = new MinimalScalarProductInput(xVector, yVector);
	MinimalScalarProductOutputProducer outputProducer = new MinimalScalarProductOutputProducer();	
	Assert.assertEquals("-25", outputProducer.produceOutput(integerVectorPair).formatOutput());
    }

    @Test
    public void providedTest2() {
	int[] xVector = { 1, 2, 3, 4, 5 };
	int[] yVector = { 1, 0, 1, 0, 1 };
	MinimalScalarProductInput integerVectorPair = new MinimalScalarProductInput(xVector, yVector);
	MinimalScalarProductOutputProducer outputProducer = new MinimalScalarProductOutputProducer();	
	Assert.assertEquals("6", outputProducer.produceOutput(integerVectorPair).formatOutput());
    }
    
    @Test
    public void largeDataset () {
	int[] xVector = new int[800];
	int[] yVector = new int[800];
	for (int i = 0; i < 800; i++) {
	    xVector[i] = 100000;
	    yVector[i] = 100000;
	}
	MinimalScalarProductInput integerVectorPair = new MinimalScalarProductInput(xVector, yVector);
	MinimalScalarProductOutputProducer outputProducer = new MinimalScalarProductOutputProducer();	
	Assert.assertEquals("8000000000000", outputProducer.produceOutput(integerVectorPair).formatOutput());
    }
}

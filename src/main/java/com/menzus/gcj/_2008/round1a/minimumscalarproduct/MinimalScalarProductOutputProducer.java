package com.menzus.gcj._2008.round1a.minimumscalarproduct;

import java.util.Arrays;

import com.menzus.gcj.common.OutputProducer;


public class MinimalScalarProductOutputProducer implements
	OutputProducer<MinimalScalarProductInput, MinimalScalarProductOutput> {

    @Override
    public MinimalScalarProductOutput produceOutput(MinimalScalarProductInput input) {
	int[] copyOfXVector = Arrays.copyOf(input.getXVector(), input.getXVector().length);
	int[] copyOfYVector = Arrays.copyOf(input.getYVector(), input.getYVector().length);
	Arrays.sort(copyOfXVector);
	Arrays.sort(copyOfYVector);
	MinimalScalarProductOutput scalarProduct = new MinimalScalarProductOutput();
	for (int i = 0; i < copyOfYVector.length; i++) {
	    long xi = copyOfXVector[i];
	    long yi = copyOfYVector[copyOfYVector.length - i - 1];
	    scalarProduct.add(xi * yi);
	}
	return scalarProduct;
    }
}

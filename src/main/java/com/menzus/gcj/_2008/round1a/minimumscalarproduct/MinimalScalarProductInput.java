package com.menzus.gcj._2008.round1a.minimumscalarproduct;

import com.menzus.gcj.common.Input;

public class MinimalScalarProductInput implements Input {

    private int[] xVector;
    private int[] yVector;

    public MinimalScalarProductInput(int[] xVector, int[] yVector) {
	this.xVector = xVector;
	this.yVector = yVector;
    }

    public int[] getXVector() {
	return xVector;
    }

    public int[] getYVector() {
	return yVector;
    }
}

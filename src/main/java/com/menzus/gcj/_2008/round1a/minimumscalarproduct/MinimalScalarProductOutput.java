package com.menzus.gcj._2008.round1a.minimumscalarproduct;

import com.menzus.gcj.common.OutputEntry;

public class MinimalScalarProductOutput implements OutputEntry {
    private Long scalarProduct = 0l;

    public void add(long value) {
	scalarProduct += value;
    }

    @Override
    public String formatOutput() {
	return scalarProduct.toString();
    }
}

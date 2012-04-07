package com.menzus.gcj._2008.round1a.numbers;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import com.menzus.gcj.common.OutputEntry;

public class NumbersOutput implements OutputEntry {
    private int lastThreeIntegerDigits;

    public NumbersOutput(int lastThreeIntegerDigits) {
	this.lastThreeIntegerDigits = lastThreeIntegerDigits;
    }

    @Override
    public String formatOutput() {
	NumberFormat numberFormat = new DecimalFormat("000");
	return numberFormat.format(lastThreeIntegerDigits);
    }
}

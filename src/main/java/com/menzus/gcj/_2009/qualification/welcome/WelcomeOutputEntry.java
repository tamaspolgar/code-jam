package com.menzus.gcj._2009.qualification.welcome;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import com.menzus.gcj.common.OutputEntry;

public class WelcomeOutputEntry implements OutputEntry {
    private int matchNumber;

    public void setMatchNumber(int matchNumber) {
	this.matchNumber = matchNumber;
    }

    @Override
    public String formatOutput() {
	NumberFormat numberFormat = new DecimalFormat("0000");
	return numberFormat.format(matchNumber);
    }
}

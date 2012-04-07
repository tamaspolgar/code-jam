package com.menzus.gcj._2009.qualification.welcome;

import com.menzus.gcj.common.OutputProducer;

public class WelcomeOutputProducer implements OutputProducer<WelcomeInput, WelcomeOutputEntry> {

    private static final char[] TARGET = "welcome to code jam".toCharArray();

    @Override
    public WelcomeOutputEntry produceOutput(WelcomeInput welcomeInput) {
	char[] input = welcomeInput.getInputLine().toCharArray();
	int[] matches = new int[TARGET.length + 1];
	matches[0] = 1;
	for (int i = 0; i < input.length; i++) {
	    for (int j = 0; j < TARGET.length; j++) {
		if (input[i] == TARGET[j]) {
		    matches[j + 1] += matches[j];
		    if (matches[j + 1] > 10000) {
			matches[j + 1] = matches[j + 1] % 10000;
		    }
		}
	    }
	}
	WelcomeOutputEntry outputEntry = new WelcomeOutputEntry();
	outputEntry.setMatchNumber(matches[TARGET.length]);
	return outputEntry;
    }
}

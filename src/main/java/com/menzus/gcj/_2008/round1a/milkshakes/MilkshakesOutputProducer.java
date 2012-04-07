package com.menzus.gcj._2008.round1a.milkshakes;

import com.menzus.gcj.common.OutputProducer;

public class MilkshakesOutputProducer implements OutputProducer<MilkshakesInput, MilkshakesOutput> {

    @Override
    public MilkshakesOutput produceOutput(MilkshakesInput milkshakesInput) {
	boolean[] maltedMilkshakes = new boolean[milkshakesInput.getMilkshakeTypeNumber()];
	for (int i = 0; i < milkshakesInput.getCustomerPreferences().size(); i++) {
	    CustomerPreference customerPreference = milkshakesInput.getCustomerPreferences().get(i);
	    if (!customerIsSatisfiedWithCurrentMilkshakes(customerPreference, maltedMilkshakes)) {
		if (satisfyCustomerIfPossible(customerPreference, maltedMilkshakes)) {
		    i = -1;
		    continue;
		} else {
		    return new MilkshakesOutput(null);
		}
	    }
	}
	return new MilkshakesOutput(maltedMilkshakes);
    }

    private boolean satisfyCustomerIfPossible(CustomerPreference customerPreference, boolean[] maltedMilkshakes) {
	if (customerPreference.getMaltedMilkshakeNumber() == null
		|| maltedMilkshakes[customerPreference.getMaltedMilkshakeNumber()]) {
	    return false;
	} else {
	    maltedMilkshakes[customerPreference.getMaltedMilkshakeNumber()] = true;
	    return true;
	}
    }

    private boolean customerIsSatisfiedWithCurrentMilkshakes(CustomerPreference customerPreference,
	    boolean[] maltedMilkshakes) {
	if (customerPreference.getMaltedMilkshakeNumber() != null
		&& maltedMilkshakes[customerPreference.getMaltedMilkshakeNumber()]) {
	    return true;
	}
	for (Integer milkshakeNumber : customerPreference.getUnMaltedMilkshakeNumbers()) {
	    if (!maltedMilkshakes[milkshakeNumber]) {
		return true;
	    }
	}
	return false;
    }
}

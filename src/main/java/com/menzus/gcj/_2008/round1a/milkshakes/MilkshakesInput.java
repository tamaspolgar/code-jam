package com.menzus.gcj._2008.round1a.milkshakes;


import java.util.ArrayList;
import java.util.List;

import com.menzus.gcj.common.Input;

public class MilkshakesInput implements Input {
    private List<CustomerPreference> customerPreferences = new ArrayList<CustomerPreference>();
    private int milkshakeTypeNumber;

    public MilkshakesInput(int milkshakeTypeNumber) {
	this.milkshakeTypeNumber = milkshakeTypeNumber;
    }

    public int getMilkshakeTypeNumber() {
	return milkshakeTypeNumber;
    }

    public void setMilkshakeTypeNumber(int milkshakeTypeNumber) {
	this.milkshakeTypeNumber = milkshakeTypeNumber;
    }

    public List<CustomerPreference> getCustomerPreferences() {
	return customerPreferences;
    }

    public void setCustomerPreferences(List<CustomerPreference> customerPreferences) {
	this.customerPreferences = customerPreferences;
    }
}

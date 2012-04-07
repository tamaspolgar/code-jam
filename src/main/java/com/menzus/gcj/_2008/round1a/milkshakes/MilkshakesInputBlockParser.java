package com.menzus.gcj._2008.round1a.milkshakes;


import java.util.Iterator;

import com.menzus.gcj.common.InputBlockParser;

public class MilkshakesInputBlockParser implements InputBlockParser<MilkshakesInput> {

    @Override
    public MilkshakesInput parseLineIterator(Iterator<String> lineIterator) {
	String milkshakeTypeNumberString = lineIterator.next();
	int milkshakeTypeNumber = Integer.parseInt(milkshakeTypeNumberString);
	MilkshakesInput milkshakePreference = new MilkshakesInput(milkshakeTypeNumber);
	String customerNumberString = lineIterator.next();
	int customerNumber = Integer.parseInt(customerNumberString);
	for (int i = 0; i < customerNumber; i++) {
	    CustomerPreference customerPreferences = parseCustomerPreferences(lineIterator);
	    milkshakePreference.getCustomerPreferences().add(customerPreferences);
	}
	return milkshakePreference;
    }

    private CustomerPreference parseCustomerPreferences(Iterator<String> lineIterator) {
	String customerPreferencesElementsString = lineIterator.next();
	String[] customerPreferencesElements = customerPreferencesElementsString.split(" ");
	CustomerPreference customerPreferences = new CustomerPreference();
	for (int i = 1; i < customerPreferencesElements.length; i += 2) {
	    String flavorString = customerPreferencesElements[i];
	    Integer milkshakeNumber = Integer.parseInt(flavorString) - 1;
	    boolean malted = "1".equals(customerPreferencesElements[i + 1]);
	    if (malted) {
		customerPreferences.setMaltedMilkshakeNumber(milkshakeNumber);
	    } else {
		customerPreferences.getUnMaltedMilkshakeNumbers().add(milkshakeNumber);
	    }
	}
	return customerPreferences;
    }
}

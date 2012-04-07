package com.menzus.gcj._2008.round1a.milkshakes;

import org.junit.Assert;
import org.junit.Test;

import com.menzus.gcj._2008.round1a.milkshakes.CustomerPreference;
import com.menzus.gcj._2008.round1a.milkshakes.MilkshakesInput;
import com.menzus.gcj._2008.round1a.milkshakes.MilkshakesOutputProducer;

public class MilkshakesInputTests {
    private MilkshakesInput milkshakesInput;

    @Test
    public void givenTest1() {
	milkshakesInput = new MilkshakesInput(5);
	CustomerPreference customerPreference0 = new CustomerPreference();
	customerPreference0.setMaltedMilkshakeNumber(0);
	milkshakesInput.getCustomerPreferences().add(customerPreference0);

	CustomerPreference customerPreference1 = new CustomerPreference();
	customerPreference1.getUnMaltedMilkshakeNumbers().add(0);
	customerPreference1.getUnMaltedMilkshakeNumbers().add(1);
	milkshakesInput.getCustomerPreferences().add(customerPreference1);

	CustomerPreference customerPreference3 = new CustomerPreference();
	customerPreference3.getUnMaltedMilkshakeNumbers().add(4);
	milkshakesInput.getCustomerPreferences().add(customerPreference3);

	MilkshakesOutputProducer milkshakesOutputProducer = new MilkshakesOutputProducer();

	Assert.assertEquals("1 0 0 0 0", milkshakesOutputProducer.produceOutput(milkshakesInput).formatOutput());
    }

    @Test
    public void givenTest2() {
	milkshakesInput = new MilkshakesInput(2);
	CustomerPreference customerPreference1 = new CustomerPreference();
	customerPreference1.setMaltedMilkshakeNumber(0);
	milkshakesInput.getCustomerPreferences().add(customerPreference1);

	CustomerPreference customerPreference2 = new CustomerPreference();
	customerPreference2.getUnMaltedMilkshakeNumbers().add(0);
	milkshakesInput.getCustomerPreferences().add(customerPreference2);

	MilkshakesOutputProducer milkshakesOutputProducer = new MilkshakesOutputProducer();

	Assert.assertEquals("IMPOSSIBLE", milkshakesOutputProducer.produceOutput(milkshakesInput).formatOutput());
    }
}

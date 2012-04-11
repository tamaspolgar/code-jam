package com.menzus.gcj._2008.round1a.milkshakes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.menzus.gcj._2008.round1a.milkshakes.CustomerPreference;
import com.menzus.gcj._2008.round1a.milkshakes.MilkshakesInput;
import com.menzus.gcj._2008.round1a.milkshakes.MilkshakesOutputProducer;

public class MilkshakesOutputProducerTest {
    private MilkshakesOutputProducer outputProducer;
    
    @Before
    public void before() {
	outputProducer = new MilkshakesOutputProducer();
    }

    @Test
    public void givenTest1() {
	MilkshakesInput input = new MilkshakesInput(5);
	CustomerPreference customerPreference0 = new CustomerPreference();
	customerPreference0.setMaltedMilkshakeNumber(0);
	input.getCustomerPreferences().add(customerPreference0);

	CustomerPreference customerPreference1 = new CustomerPreference();
	customerPreference1.getUnMaltedMilkshakeNumbers().add(0);
	customerPreference1.getUnMaltedMilkshakeNumbers().add(1);
	input.getCustomerPreferences().add(customerPreference1);

	CustomerPreference customerPreference3 = new CustomerPreference();
	customerPreference3.getUnMaltedMilkshakeNumbers().add(4);
	input.getCustomerPreferences().add(customerPreference3);

	Assert.assertEquals("1 0 0 0 0", outputProducer.produceOutput(input).formatOutput());
    }

    @Test
    public void givenTest2() {
	MilkshakesInput input = new MilkshakesInput(2);
	CustomerPreference customerPreference1 = new CustomerPreference();
	customerPreference1.setMaltedMilkshakeNumber(0);
	input.getCustomerPreferences().add(customerPreference1);

	CustomerPreference customerPreference2 = new CustomerPreference();
	customerPreference2.getUnMaltedMilkshakeNumbers().add(0);
	input.getCustomerPreferences().add(customerPreference2);

	Assert.assertEquals("IMPOSSIBLE", outputProducer.produceOutput(input).formatOutput());
    }
}

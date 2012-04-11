package com.menzus.gcj._2008.round1a.milkshakes;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.menzus.gcj._2008.round1a.milkshakes.CustomerPreference;
import com.menzus.gcj._2008.round1a.milkshakes.MilkshakesInput;
import com.menzus.gcj._2008.round1a.milkshakes.MilkshakesInputBlockParser;

public class MilkshakesInputBlockParserTest {
    private MilkshakesInputBlockParser parser;

    @Before
    public void before() {
	parser = new MilkshakesInputBlockParser();
    }

    @Test
    public void givenTest1() {
	Iterator<String> lineIterator = Arrays.asList("5", "2", "1 1 1", "2 1 0 2 0").iterator();
	MilkshakesInput milkshakePreference = parser.parseLineIterator(lineIterator);
	
	Assert.assertEquals(5, milkshakePreference.getMilkshakeTypeNumber());
	Assert.assertEquals(2, milkshakePreference.getCustomerPreferences().size());
	
	CustomerPreference customerPreference0 = milkshakePreference.getCustomerPreferences().get(0);
	Assert.assertEquals(0, customerPreference0.getUnMaltedMilkshakeNumbers().size());
	Assert.assertEquals(new Integer(0), customerPreference0.getMaltedMilkshakeNumber());

	CustomerPreference customerPreference1 = milkshakePreference.getCustomerPreferences().get(1);
	Assert.assertEquals(2, customerPreference1.getUnMaltedMilkshakeNumbers().size());
	Assert.assertEquals(new Integer(0), customerPreference1.getUnMaltedMilkshakeNumbers().get(0));
	Assert.assertEquals(new Integer(1), customerPreference1.getUnMaltedMilkshakeNumbers().get(1));	
	Assert.assertNull(customerPreference1.getMaltedMilkshakeNumber());
    }
}

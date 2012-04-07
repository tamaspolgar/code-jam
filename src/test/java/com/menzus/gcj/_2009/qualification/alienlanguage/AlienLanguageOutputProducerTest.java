package com.menzus.gcj._2009.qualification.alienlanguage;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlienLanguageOutputProducerTest {
    private AlienLanguageOutputProducer outputProducer;

    @Before
    public void before() {
	outputProducer = new AlienLanguageOutputProducer();
    }
    
    @Test
    public void produceOutput() {
	AlienLanguageInput input = new AlienLanguageInput();
	input.setWords(Arrays.asList("abc", "bca", "dac", "dbc", "cba"));
	input.setPatterns(Arrays.asList("(ab)(bc)(ca)", "abc", "(abc)(abc)(abc)", "(zyx)bc"));
	
	AlienLanguageOutputList outputList = outputProducer.produceOutput(input);
	
	List<AlienLanguageOutputEntry> outputEntries = outputList.getOutputEntries();
	Assert.assertEquals(4, outputEntries.size());
	Assert.assertEquals("2", outputEntries.get(0).formatOutput());
	Assert.assertEquals("1", outputEntries.get(1).formatOutput());
	Assert.assertEquals("3", outputEntries.get(2).formatOutput());
	Assert.assertEquals("0", outputEntries.get(3).formatOutput());
    }
}

package com.menzus.gcj.common.impl;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.menzus.gcj.common.Input;
import com.menzus.gcj.common.Output;
import com.menzus.gcj.common.OutputProducer;

public class DefaultOutputListProducerTest {

    private DefaultOutputListProducer<Input, Output> producer;

    @Mock
    private OutputProducer<Input, Output> outputProducer;

    @Before
    public void before() {
	MockitoAnnotations.initMocks(this);
	producer = new DefaultOutputListProducer<Input, Output>();
	producer.setOutputProducer(outputProducer);
    }

    @Test
    public void produceOutputs() {
	Input input0 = Mockito.mock(Input.class);
	Input input1 = Mockito.mock(Input.class);

	Output output0 = Mockito.mock(Output.class);
	Output output1 = Mockito.mock(Output.class);
	Mockito.when(outputProducer.produceOutput(input0)).thenReturn(output0);
	Mockito.when(outputProducer.produceOutput(input1)).thenReturn(output1);

	List<Input> inputs = Arrays.asList(input0, input1);

	List<Output> outputs = producer.produceOutputs(inputs);

	Assert.assertEquals(2, outputs.size());
	Assert.assertTrue(output0 == outputs.get(0));
	Assert.assertTrue(output1 == outputs.get(1));
    }
}

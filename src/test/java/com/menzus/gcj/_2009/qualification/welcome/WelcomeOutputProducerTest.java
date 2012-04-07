package com.menzus.gcj._2009.qualification.welcome;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WelcomeOutputProducerTest {
    private WelcomeOutputProducer outputProducer;

    @Before
    public void before() {
	outputProducer = new WelcomeOutputProducer();
    }
    
    @Test
    public void givenTest1() {
	WelcomeInput input = new WelcomeInput();
	input.setInputLine("elcomew elcome to code jam"); 
	
	WelcomeOutputEntry outputEntry = outputProducer.produceOutput(input);
	
	Assert.assertEquals("0001", outputEntry.formatOutput());
    }
    
    @Test
    public void givenTest2() {
	WelcomeInput input = new WelcomeInput();
	input.setInputLine("wweellccoommee to code qps jam"); 
	
	WelcomeOutputEntry outputEntry = outputProducer.produceOutput(input);
	
	Assert.assertEquals("0256", outputEntry.formatOutput());
    }
    
    @Test
    public void givenTest3() {
	WelcomeInput input = new WelcomeInput();
	input.setInputLine("welcome to codejam"); 
	
	WelcomeOutputEntry outputEntry = outputProducer.produceOutput(input);
	
	Assert.assertEquals("0000", outputEntry.formatOutput());
    }
    
    @Test
    public void givenTest4() {
	WelcomeInput input = new WelcomeInput();
	input.setInputLine("uvyypukwwwrvgfeyegeifpuqyhglpxklxxinrkxlkllulflnfpqgxshrivssbuhhcfxbscffruvcsgxzpzchgpvcxyzcnuyhqxnqvfccqcomfshfbsumgmyupzevhygyxhesikxupefnneu n puu pqttbzhitnsqgpbfxuszgigrrtugiinizygtututprpsfsqkqfzofofgiuoivfxxnrrpyikoigqoqoqhkoz xnhif bvgxhkyus nbsuucyfppzrccyvxryuuuuzscfccrybvcqhzcrycbzscbricycccqcyoyoshzgouvvqhzuizoyviooqiffsqookkoszoihfbofzozgsixofhbdbpfhdsnfyzzfuqdsegbuqg ipfs bnpq  ixr ykqfiigrnhpxfxy qrzkpyi fxsghyyhgxpqkjfjugygzqjjpjkzzxsggbnjgxnjaarrbhrxuasbfgavakhsqauapimfrvmyymxvb"); 
	
	WelcomeOutputEntry outputEntry = outputProducer.produceOutput(input);
	
	Assert.assertEquals("8260", outputEntry.formatOutput());
    }    
}

package com.menzus.gcj._2008.round1a.milkshakes;

import java.util.ArrayList;
import java.util.List;

public class CustomerPreference {
    private List<Integer> unMaltedMilkshakeNumbers = new ArrayList<Integer>();
    private Integer maltedMilkshakeNumber;
    
    public List<Integer> getUnMaltedMilkshakeNumbers() {
        return unMaltedMilkshakeNumbers;
    }
    public void setUnMaltedMilkshakeNumbers(List<Integer> unMaltedMilkshakeNumbers) {
        this.unMaltedMilkshakeNumbers = unMaltedMilkshakeNumbers;
    }
    public Integer getMaltedMilkshakeNumber() {
        return maltedMilkshakeNumber;
    }
    public void setMaltedMilkshakeNumber(Integer maltedMilkshakeNumber) {
        this.maltedMilkshakeNumber = maltedMilkshakeNumber;
    }
}

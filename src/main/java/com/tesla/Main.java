package com.tesla;

import com.tesla.structural.decorator.p12_4.AbstractEnhancePhone;
import com.tesla.structural.decorator.p12_4.ComplexPhone;
import com.tesla.structural.decorator.p12_4.Phone;
import com.tesla.structural.decorator.p12_4.SimplePhone;

public class Main {
    public static void main(String[] args) throws Exception {
        Phone simplePhone = new SimplePhone();
        AbstractEnhancePhone complexPhone = new ComplexPhone();
        complexPhone.setPhone(simplePhone);
        complexPhone.callIn();
    }

}
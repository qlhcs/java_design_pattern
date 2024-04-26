package com.tesla.creational.factoryMethod.p4_6;

public class TxtConverterFactory extends ConverterFactory {

    @Override
    Converter create() {
        return new TxtConverter();
    }

}

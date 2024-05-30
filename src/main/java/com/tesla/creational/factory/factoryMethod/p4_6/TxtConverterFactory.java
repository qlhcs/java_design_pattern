package com.tesla.creational.factory.factoryMethod.p4_6;

public class TxtConverterFactory extends ConverterFactory {

    @Override
    Converter create() {
        return new TxtConverter();
    }

}

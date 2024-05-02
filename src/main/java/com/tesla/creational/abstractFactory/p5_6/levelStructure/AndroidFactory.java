package com.tesla.creational.abstractFactory.p5_6.levelStructure;

import com.tesla.creational.abstractFactory.p5_6.AbstractInterfaceProduct;
import com.tesla.creational.abstractFactory.p5_6.AbstractOperationProduct;
import com.tesla.creational.abstractFactory.p5_6.AbstractOperationSystemFactory;

public class AndroidFactory extends AbstractOperationSystemFactory {


    @Override
    public AbstractOperationProduct createOperationProduct() {
        return null;
    }

    @Override
    public AbstractInterfaceProduct createInterfaceProduct() {
        return null;
    }
}

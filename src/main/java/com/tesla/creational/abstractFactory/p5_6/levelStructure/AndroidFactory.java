package com.tesla.creational.abstractFactory.p5_6.levelStructure;

import com.tesla.creational.abstractFactory.p5_6.abstractProduct.AbstractInterfaceProduct;
import com.tesla.creational.abstractFactory.p5_6.abstractProduct.AbstractOperationProduct;
import com.tesla.creational.abstractFactory.p5_6.abstractFactory.AbstractOperationSystemFactory;

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

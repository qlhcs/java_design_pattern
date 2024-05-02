package com.tesla.creational.abstractFactory.p5_6.levelStructure;

import com.tesla.creational.abstractFactory.p5_6.AbstractInterfaceProduct;
import com.tesla.creational.abstractFactory.p5_6.AbstractOperationProduct;
import com.tesla.creational.abstractFactory.p5_6.AbstractOperationSystemFactory;
import com.tesla.creational.abstractFactory.p5_6.productFamily.IosInterfaceProduct;
import com.tesla.creational.abstractFactory.p5_6.productFamily.IosOperationProduct;

public class IosFactory extends AbstractOperationSystemFactory {

    @Override
    public AbstractOperationProduct createOperationProduct() {
        return new IosOperationProduct();
    }

    @Override
    public AbstractInterfaceProduct createInterfaceProduct() {
        return new IosInterfaceProduct();
    }
}
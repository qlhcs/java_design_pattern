package com.tesla.creational.abstractFactory.p5_6.abstractFactory;

import com.tesla.creational.abstractFactory.p5_6.abstractProduct.AbstractInterfaceProduct;
import com.tesla.creational.abstractFactory.p5_6.abstractProduct.AbstractOperationProduct;

public abstract class AbstractOperationSystemFactory {


    public abstract AbstractOperationProduct createOperationProduct();


    public abstract AbstractInterfaceProduct createInterfaceProduct();


}

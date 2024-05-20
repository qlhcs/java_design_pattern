package com.tesla;

import com.tesla.structural.bridge.p10_6.AbstractDataTransformUtil;
import com.tesla.structural.bridge.p10_6.MysqlUtil;
import com.tesla.structural.bridge.p10_6.TxtDataTransformUtil;
import com.tesla.structural.decorator.p12_4.AbstractEnhancePhone;
import com.tesla.structural.decorator.p12_4.ComplexPhone;
import com.tesla.structural.decorator.p12_4.Phone;
import com.tesla.structural.decorator.p12_4.SimplePhone;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractDataTransformUtil dataTransformUtil = new TxtDataTransformUtil();
        dataTransformUtil.setDataBase(new MysqlUtil());
        dataTransformUtil.transform();
    }

}
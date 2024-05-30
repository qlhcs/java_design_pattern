package com.tesla.creational.factory.simpleFactory.p3_5;

/**
 * 唯一的工厂
 */
public class ShapeFactory {

    public Shape produceShape(Integer shapeType) throws Exception {
        if (shapeType == 1) {
            return new Circle();
        } else if (shapeType == 2) {
            return new Rectangle();
        } else if (shapeType == 3) {
            return new Triangle();
        } else {
            throw new UnsupportedShapeException();
        }
    }


}

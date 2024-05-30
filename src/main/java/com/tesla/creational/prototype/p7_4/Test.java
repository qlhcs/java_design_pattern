package com.tesla.creational.prototype.p7_4;

public class Test {

    public static void main(String[] args) throws Exception {
        DataChart dataChart = new DataChart();
        dataChart.setDataSet(new DataSet());
        dataChart.setColor("red");
        dataChart.setNumber("No.9527");

        DataChart cloneDataChart = dataChart.deepClone();
        System.out.println(dataChart == cloneDataChart);
        System.out.println(dataChart.getDataSet() == cloneDataChart.getDataSet());
        System.out.println(dataChart.getColor() == cloneDataChart.getColor());
        System.out.println(dataChart.getNumber() == cloneDataChart.getNumber());
    }

}

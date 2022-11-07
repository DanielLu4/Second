package com.Daniel.es.单例模式;

public class DisCountCar extends Car{

    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}

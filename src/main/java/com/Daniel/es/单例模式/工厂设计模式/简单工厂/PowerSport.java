package com.Daniel.es.单例模式.工厂设计模式.简单工厂;

public class PowerSport implements Sport{
    @Override
    public String sportType() {
        return "力量性的运动";
    }

    @Override
    public String name(String name) {
        return null;
    }
}

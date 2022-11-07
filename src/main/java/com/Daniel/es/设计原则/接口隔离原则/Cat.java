package com.Daniel.es.设计原则.接口隔离原则;

import com.Daniel.es.单例模式.Car;

public class Cat implements Flyable,Runnable{

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }
    interface  dao{
      static   void save(Car c){};

    }
}

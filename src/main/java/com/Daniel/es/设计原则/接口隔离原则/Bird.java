package com.Daniel.es.设计原则.接口隔离原则;

import com.Daniel.es.设计原则.接口隔离原则.Animal;

public class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("dog eat bone");
    }

    @Override
    public void name() {
        System.out.println("name 犬");
    }

    @Override
    public void fly() {
        throw new RuntimeException("不会飞");
    }
}

package com.Daniel.es.单例模式.工厂设计模式.抽象与实现;

public interface InterFaceB extends InterFaceA{
    default void interB(){
        System.out.println("这个是接口B的方法");
    }
}

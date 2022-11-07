package com.Daniel.es.单例模式.工厂设计模式.抽象与实现;

public interface InterFaceA {


     static int gg = 9;
     default int interA(){
        System.out.println("这个是接口A的方法");
        return gg;
    }
    String interAString(String name);
}

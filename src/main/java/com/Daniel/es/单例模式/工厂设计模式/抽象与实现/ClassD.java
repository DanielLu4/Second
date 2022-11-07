package com.Daniel.es.单例模式.工厂设计模式.抽象与实现;

public class ClassD extends AbstractAA {

    ClassD(String s){
        super(s);

        //  System.out.println("我的是ClassD的构造方法，我继承饿了AbustrctAA,的构造方法");
    }

    //继承抽象类，也要实现接口中定义的抽象方法
    @Override
    public String interAString(String name) {
        String s = new String();
       // String string = super.interAString();
        return null;

    }
}

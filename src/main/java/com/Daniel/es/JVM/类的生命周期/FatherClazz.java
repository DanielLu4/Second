package com.Daniel.es.JVM.类的生命周期;

public class FatherClazz {

   static {
        System.out.println("静态father的代码块");
    }

    public FatherClazz(){

        System.out.println(this.hashCode()+"father的构造方法");
    }
}

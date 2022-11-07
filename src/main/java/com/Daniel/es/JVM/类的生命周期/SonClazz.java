package com.Daniel.es.JVM.类的生命周期;

public class SonClazz extends FatherClazz{

   static  {
        System.out.println("静态son的代码块");
    }
    public SonClazz(){
        System.out.println("son的构造方法");
    }

}

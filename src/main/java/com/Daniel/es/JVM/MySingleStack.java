package com.Daniel.es.JVM;

public class MySingleStack {
    public static void main(String[] args) {


    }
   void f1(){
        String 变量="bl";
        System.out.println("f2方法");
        this.f1();
    }

    static void f2(){
        double age=20;
        int a =0;
        System.out.println("f2方法");
    }
    static void f3(){
        char a=11;
    }
}

package com.Daniel.es.设计原则.里氏替换法则;

public class AppTest {

    public static void main(String args[]) {
        //创建了子类对象，通过父类的转型
        father f = new son();
        f.f1();

    }



}
class father{
    protected  void  f1(){
        System.out.println("eat");
        this.f1();

    }
}
class son extends father{
    public void f1() {
        System.out.println("son eat");


    }
}

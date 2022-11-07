package com.Daniel.es.设计原则.依赖倒置;

class Person{
    public void feed(Dog dog){
        System.out.print("人喂养:");
        dog.eat();
    }
    public void feed(Cat dog){
        System.out.print("人喂养:");
        dog.eat();
    }
}
interface Animal{
    void eat();
}

class Dog implements  Animal{
    public void eat(){
        System.out.println("啃骨头");
    }
}

class Cat implements  Animal {
    public void eat(){
        System.out.println("猫吃鱼");
    }
}

//==============================================
public class AppTest {

    public static void main(String[] args) {
        Person person = new Person();

        Dog dog = new Dog();
      dog.eat();
        System.out.println("+++++++++++++");
        Cat cat = new Cat();
        cat.eat();

    }
}
//=======================
class  Foo{

  //  int a =f1();

//    public int f1(){
//        return 2;
//    }

//    static {
//        System.out.println("1");
//    }
    //构造代码块
    {
        System.out.println("A");
    }

    public Foo(){
        System.out.println("构造器输出");
    }

    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                Object o = new Object();
                synchronized (o){
                    for (int i=0;i<10;i++){
                        System.out.println("A");
                        o.notifyAll();
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                Object o = new Object();
                synchronized (o){
                    for (int i=0;i<10;i++){
                        System.out.println("B");
                        o.notifyAll();
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }

            }
        };

        Thread thread = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread.start();
        thread2.start();


    }


}


package com.Daniel.es.JVM;

import sun.misc.Launcher;

import java.util.ServiceLoader;

public class MyClassLoad {
    public static void main(String[] args) {
//        System.out.println("名字："+String.class.getClassLoader());
//        System.out.println("名字："+sun.net.spi.nameservice.dns.DNSNameServiceDescriptor.class.getClassLoader());
//        Launcher launcher = new Launcher();
//        for (int i = 0; i < 10_0000; i++) {
//            fun1();
//        }
//        long l = System.currentTimeMillis();
//        for (int i = 0; i < 10_0000; i++) {
//            fun1();
//        }
//        long s = System.currentTimeMillis();
//        System.out.println(s-l);

        for (int i = 0; i <110_0 ; i++) {
            System.out.println("数字"+i);
        }


        ServiceLoader<MyClassLoad> load = ServiceLoader.load(MyClassLoad.class);

    }

//    static  void fun1(){
//        for (int i = 0; i <10_0000L ; i++) {
//                int j=i%3;
//        }
//    }
}

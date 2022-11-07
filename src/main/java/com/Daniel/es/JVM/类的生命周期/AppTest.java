package com.Daniel.es.JVM.类的生命周期;

import org.openjdk.jol.info.ClassLayout;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicStampedReference;

public class AppTest {


    volatile String a=null;
    private  volatile  int g1;

//    public volatile void  h1(){
//
//    }
    public static void main(String[] args) {

//        Object o = new Object();
//        String classLayout = ClassLayout.parseInstance(o).toPrintable();
//        System.out.println(classLayout);
//
//        synchronized (o){
//            System.out.println(ClassLayout.parseInstance(o).toPrintable());
//        }
//
//        new Hashtable<>();
//        new HashMap<>();
//        StringBuffer stringBuffer = new StringBuffer();

            synchronized ("d"){

            }

//        SonClazz sonClazz = new SonClazz();
//        SonClazz sonClazz1 = new SonClazz();
//        SonClazz sonClazz2 = new SonClazz();
//        SonClazz sonClazz3= new SonClazz();

       // FatherClazz fatherClazz = new FatherClazz();

//        Thread thread = new Thread(() ->{
//            for (int i = 0; i <1000 ; i++) {
//                System.out.println(i);
//            }
//
//        });
//       thread.setDaemon(true);
//        thread.start();

        Object o = new Object();
        AtomicStampedReference atomicStampedReference = new AtomicStampedReference(o,11);


        //System.out.println(String.class.getClassLoader());
    }
}

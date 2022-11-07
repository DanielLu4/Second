package com.Daniel.es.单例模式;

import com.Daniel.es.JVM.类的生命周期.SonClazz;

public class AppTest {
    public static void main(String[] args) {

//     new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                singleModel single = singleModel.getSingle();
//                System.out.println(single.hashCode()+"thread");
//            }
//        }).start();

//        Thread thread = new Thread() {
//            @Override
//            public void run(){
//                for (int i = 0; i < 10; i++) {
//                    singleModel single = singleModel.getSingle();
//                    System.out.println(single.hashCode()+"::dd");
//                }
//            }
//        };
        Thread[] threads = new Thread[30];
        for (int i = 0; i < threads.length-1; i++) {
           threads[i]=new Thread(()->{

               System.out.println( singleModel.getSingle().hashCode());
           });
        }
        for (Thread t:threads) {
            if(t!=null){
                t.start();
            }

        }

        SonClazz[] sonClazzes = new SonClazz[10];
//
//        new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                singleModel single = singleModel.getSingle();
//                System.out.println(single.hashCode());
//            }
//        }).start();

//        for (int i = 0; i < 10; i++) {
//            singleModel single = singleModel.getSingle();
//            System.out.println(single.hashCode());
//        }
    }
}

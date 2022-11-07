package com.Daniel.es.线程池;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

import static java.util.concurrent.TimeUnit.MINUTES;
import static sun.misc.PostVMInitHook.run;

public class threadPool {

    public static void main(String[] args) {
//
//        new Thread(()->{
//            System.out.println("ss");
//        }).start();
//
//        new Thread(()->{
//            System.out.println("rr");
//        }).start();

//        Thread[] threads = new Thread[333];
//        Executors.newCachedThreadPool();
//        Executors.newSingleThreadExecutor();
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,1,1,MINUTES,new ArrayBlockingQueue<Runnable>(2));
//
//        Executors.newSingleThreadExecutor(new ThreadFactory() {
//            @Override
//            public Thread newThread(Runnable r) {
//                return null;
//            }
//        });
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(
                "coreNum:"+i
        );
    }

}

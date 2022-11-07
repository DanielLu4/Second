package com.Daniel.es.JVM.类的生命周期;

import java.util.concurrent.*;

public class StringTest {
    private static Object Runnable;

    public static void main(String[] args) {

        String a=new String("aaa");
        String b=new String("aaa");
        String c="aaa";
        String d="aaa";
        //String b="aaa";
        System.out.println(a.hashCode()==b.hashCode());
        System.out.println(a==b);
        System.out.println(a.codePoints());
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1,
                1,
                11,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<Runnable>(2),
                new RejectedExecutionHandler() {
                    @Override
                    public void rejectedExecution(java.lang.Runnable r, ThreadPoolExecutor executor) {

                    }
                });



//        threadPoolExecutor.execute(()->{
//
//
//        });
//    }

}
}

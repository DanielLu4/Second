package com.Daniel.es.JVM.双亲委派;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AppTest {
    public static void main(String[] args) {
//        int []a ={-3,3,0,8};
//        int flag = a[0];
//
//        for (int i = 0; i <a.length ; i++) {
//
//            if (a[i]>flag){
//                flag=a[i];
//            }
//        }
//
//
//        ArrayList<? extends Number> integers = new ArrayList<Integer>();
//
//        integers.get(1);

        int b =9;
        String bb=null;
        bb=String.valueOf(b);
        ArrayList<Object> objects1 = new ArrayList<>();


        List<Object> objects = new ArrayList<>();
        System.out.println(bb);

        Object o = new Object();

    }

    public  <T>void  fi (){}
}

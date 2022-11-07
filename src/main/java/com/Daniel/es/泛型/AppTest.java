package com.Daniel.es.泛型;

import java.util.ArrayList;

public class AppTest {

    public static void main(String[] args) {

        Fan<Object> f1 = new Fan<>();
        f1.setFan("dw");
        f1.setFan(1);
        System.out.println(f1);


        ArrayList<String> d = new ArrayList<String>();
        d.add("dw");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        System.out.println(d.getClass() instanceof Object);

    }
}

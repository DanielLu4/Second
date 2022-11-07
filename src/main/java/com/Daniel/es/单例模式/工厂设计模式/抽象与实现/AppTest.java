package com.Daniel.es.单例模式.工厂设计模式.抽象与实现;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {
//        InterFaceA classC = new ClassC();
//        classC.interA();
//
//
//        List<Object> objects = new ArrayList<>();
//        objects.get(1);
//        ArrayList<Object> objects1 = new ArrayList<>();
////        objects1.add(3);
//
//        InterFaceA a=new ClassC();
//       // a.interAString("s");
//        int i = a.interA();
//        //i=98;
//        System.out.println(i);
//        // a.interAString(
        String s = new String();
        ClassD classD = new ClassD(s);
        System.out.println(classD);

        DateFormat.getAvailableLocales();
        SimpleDateFormat.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("");
    }
}

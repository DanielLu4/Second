package com.Daniel.es.单例模式.工厂设计模式.简单工厂;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class AppTest {
    public static void main(String[] args) {
//        PETeacher peTeacher = new PETeacher();
//        Sport sg = peTeacher.teach("对抗");
//        System.out.println(sg.sportType());

      //  PETeacher peTeacher = new PETeacher("对抗");
//        DataFormat dataFormat = new DataFormat("");
//        Set<String> identifiers =
//                dataFormat.getIdentifiers();
       // DateFormat instance = DateFormat.getInstance();
//        DateFormat dateInstance = DateFormat.getDateInstance(1);
        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //StringBuffer
        String format = simpleDateFormat.format(date);

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(format);

//        money money = new money();
//        String format = money.format();
//
//        System.out.println(format);

    }
}

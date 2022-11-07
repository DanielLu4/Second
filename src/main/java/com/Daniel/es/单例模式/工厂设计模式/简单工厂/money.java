package com.Daniel.es.单例模式.工厂设计模式.简单工厂;

import com.sun.istack.internal.NotNull;

public class money extends Economy {

    public  void  test1(@NotNull String s, @NotNull Integer integer, @NotNull Double d){
        System.out.println("测试Test");
    }


    @Override
    public String test1(String s, int i) {
        return "这个是money重写的内容";
    }


}

package com.Daniel.es.单例模式.工厂设计模式.简单工厂;

import com.sun.istack.internal.NotNull;

public abstract class Economy {


    public final String format(){
        return test1(new String(),2);
    }

    public abstract String test1(@NotNull String s,@NotNull  int i);



    interface  test{

        void Sting ();

    }
}

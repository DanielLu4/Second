package com.Daniel.es.JVM.双亲委派;

import java.util.Iterator;
import java.util.ServiceLoader;

/*
* @Todo：加载驱动：使用SPi
* */
public class DriverManger {

    public void loadDriver() {
        ServiceLoader<MyJDBCDriver> load = ServiceLoader.load(MyJDBCDriver.class);

        Iterator<MyJDBCDriver> iterable=load.iterator();

        while (iterable.hasNext()){
            MyJDBCDriver next = iterable.next();
            System.out.println("第三方驱动"+ next.driverName());
        }
    }

}

package com.Daniel.es.JVM.双亲委派;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public  class Test1 {

    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://127.0.0.1:3306/ybjj_db?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8";
   Connection xw = DriverManager.getConnection(url,"root","833E4ABBC56C89041A9070F043641E3B");

        Enumeration<Driver> drivers = DriverManager.getDrivers();
        while(drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            System.out.println(driver);
            System.out.println(driver.getClass().getClassLoader());
        }

    }
}

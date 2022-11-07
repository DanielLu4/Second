package com.Daniel.es.单例模式;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class NewGetByte
{
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="北";

        byte[] bytes = s.getBytes("gbk");
        System.out.println(Arrays.toString(bytes));

        int a=99;
        System.out.println("内容是:"+(double) 80808);

        DisCountCar disCountCar = new DisCountCar();
        disCountCar.setPrice(90.0);
        System.out.println("价格是："+disCountCar.getPrice());
    }
}

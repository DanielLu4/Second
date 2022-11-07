package com.Daniel.es.单例模式;

//import org.apache.lucene.search.suggest.analyzing.FSTUtil;
//
import javax.xml.crypto.Data;
import java.io.*;
import java.util.Date;

public class singleModel {
  // private static  singleModel n=new singleModel();
   private  static  singleModel n;


    private  singleModel(){

    }

    public  static  singleModel getSingle(){
        if(n==null) {
            synchronized (singleModel.class) {
                if (n == null) {
                    n = new singleModel();
                }
            }
        }
       return n;
    }

//    public static void main(String[] args) throws IOException {
//        //读取文本中有多少个字符
//
//
//    }


}

package com.taiping.waibao;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenla
 * @create 2020-12-20 11:48 AM
 */
public class Demo2 {


    public static final int aa=123;
    public static final String s="asdas";


    public static void main(String[] args) {
    //    System.out.println("你好啊！！！");
    //    System.out.println("args = [" + args + "]");
//        System.out.println("Demo2.main");
//        System.out.println("args = " + args);
      //   method();

         /*List list = new ArrayList<String>();
        list.add("1111");
        list.add("2222");
        list.add("3333");

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list = " + list.get(i));
        }
        for (Object o : list) {
            System.out.println(o);
        }*/


        List list = new ArrayList<String>();
        list.add("1111");
        list.add("2222");
        list.add("3333");


        if (list == null) {

        }

        if (list != null) {

        }



    }

    public static  void method(){

        String arr[] = {"11","22","43","34"};

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
        for (String s : arr) {
            System.out.println("s = " + s);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + arr[i]);

        }
    }


}

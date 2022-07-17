package com.atguigu.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;


public class Customer1 {

    private static int num1;

    public Customer1() {
    }

    private static final int INITIAL_SIZE = 10;

    public static void main(String[] args) {
        //region Description
        ArrayList list1 = getList();

//        method1();

        System.out.println(list1);

    }

    public static ArrayList getList() {
        System.out.println("hello world111");
        System.out.println("hello world222");
        System.out.println("hello world333");
        ArrayList list1 = new ArrayList();
        //endregion

        /*ArrayList list1 = null;
        synchronized ();*/



        Date date = new Date();
        list1.add(0, 123);//提示方法参数类型(Parameter Info)   ctrl+alt+/
        return list1;
    }

    public static void method1() {
        num1 = 10;

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

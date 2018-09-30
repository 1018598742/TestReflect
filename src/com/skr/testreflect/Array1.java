package com.skr.testreflect;

import java.lang.reflect.Array;

public class Array1 {

    public static void main(String[] args) {

        try {
            Class cls = Class.forName("java.lang.String");
            Object arr = Array.newInstance(cls, 10);
            Array.set(arr, 5, "this is a test");
            String s = (String) Array.get(arr, 5);
            System.out.println(s);

            /*
            例中创建了 10 个单位长度的 String 数组，为第 5 个位置的字符串赋了值，最后将这个字符串从数组中取得并打印了出来。
             */
        } catch (Throwable e) {
            System.err.println(e);
        }

    }
}

package com.skr.testreflect;

import com.skr.testreflect.bean.Point;

import java.lang.reflect.Field;

public class FiledReflect {

    public static void main(String[] args) {

        try {
            fieldReflect();
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static void fieldReflect() throws NoSuchFieldException, IllegalAccessException {
        Point p1 = new Point(5, 39);
        Point p2 = new Point(3, 9);

        Field fieldY = p1.getClass().getDeclaredField("y");
        int y = (int) fieldY.get(p1);
        System.out.println(y);

        //对私有成员变量，可以进行暴力反射
        Field fieldX = p1.getClass().getDeclaredField("x");
        fieldX.setAccessible(true);//暴力反射
        int x = (int) fieldX.get(p1);//取对应p1对象的x字段的值
        System.out.println(x);
    }
}

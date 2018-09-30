package com.skr.testreflect;

import com.skr.testreflect.bean.Person;

import java.lang.reflect.Field;

public class FiledReflect2 {

    public static void main(String[] args) {


        filedReflect2 ();//通过反射修改字段的值

    }




    /**
     * 字段的反射
     * 运行结果：
     * Person{name='zhAngsAn', age=25, nickName='Amao'}
     * Person{name='zhAngsAn', age=25, nickName='AmAo'}
     *
     */
    private static void filedReflect2 () {
        Person p = new Person("zhangsan", 25, "Amao");
        //得到字节码,通过字节码得到这个类的所有方法

        try {
            Class<?> personCls = Class.forName("com.skr.testreflect.bean.Person");
            Field[] declaredFields = personCls.getDeclaredFields();
            for (Field field : declaredFields) {
                //因为一个类的字节码在内存中只有一份，所以用==比较更专业，此处用==，不用equals（）
                if (field.getType() == String.class) {
                    field.setAccessible(true);//进行暴力反射
                    String oldValue = (String) field.get(p);//获得字段的值
                    String newValue = oldValue.replace('a', 'A');
                    field.set(p, newValue);
                    System.out.println(p);
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

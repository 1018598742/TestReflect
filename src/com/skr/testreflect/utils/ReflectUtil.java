package com.skr.testreflect.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ReflectUtil {

    public static void parse(Field field, Class<?> beanClass) throws IllegalAccessException {
        Class<?> type = field.getType();
        field.setAccessible(true);
        if (type == String.class) {
            String value = (String) field.get(beanClass);
        } else if (type == int.class) {
            int value = field.getInt(beanClass);
        }
    }

    public static Map<String, Object> toMap(Object object) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        Class<?> beanClass = object.getClass();
        Field[] declaredFields = beanClass.getDeclaredFields();
        for (Field field : declaredFields) {
            String name = field.getName();
            Class<?> type = field.getType();
            field.setAccessible(true);
            Object value = null;
            if (type == String.class) {
                value = (String) field.get(object);
            } else if (type == int.class) {
                value = field.getInt(object);
            } else if (type == Integer.class) {
                value = (Integer) field.get(object);
            } else if (type == long.class) {
                value = field.getLong(object);
            } else if (type == Long.class) {
                value = (Long) field.get(object);
            }

            if (value != null) {
                map.put(name, value);
            }
        }

        return map;

    }
}

package com.skr.testreflect;


import com.skr.testreflect.bean.MPerson;
import com.skr.testreflect.utils.ReflectUtil;

import java.util.Map;


public class TestMain {
    public static void main(String[] args) {
        MPerson person = new MPerson();
        person.setAge(18);
//        person.setName("mike");
//        person.setLongName(986664465);
        person.setOtherAge(12);

        try {
            Map<String, String> stringStringMap = ReflectUtil.toMap(person);
//            Set<String> strings = stringStringMap.keySet();
//            for (String key : strings){
//                System.out.println("key:"+key+"  =value="+stringStringMap.get(key));
//            }
            System.out.println(stringStringMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}

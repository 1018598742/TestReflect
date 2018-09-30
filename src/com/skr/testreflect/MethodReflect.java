package com.skr.testreflect;

import java.lang.reflect.Method;

public class MethodReflect {

    public static void main(String[] args) throws Exception {
        String str = "abcdef";

        Method strMethod = str.getClass().getMethod("charAt", int.class);

        //得到方法之后，调用对象str的chatAt方法；
        char result = (char) strMethod.invoke(str, 1);

        System.out.println(result);//结果是b

        /*
        当一个类XXX，我们已经通过反射得到它的方法xxxMethod，那么看下面一行代码
xxxMethod.invoke(null, 1);
这表示不知道谁的xxxMethod方法，因为传递的是null，说明调用的这个方法是属于类的，就是静态方法，所以就不需要传递参数了。
         */

    }
}

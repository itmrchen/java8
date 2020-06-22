package com.javazx.designpattern.signleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @author itmrchen
 * @date 2020/6/23 2:00
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        try {
            /**
             * 反射破坏了单例
             */
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(null);
            //强行访问
            c.setAccessible(true);
            Object o1 = c.newInstance();
            Object o2 = LazyInnerClassSingleton.getInstance();
            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

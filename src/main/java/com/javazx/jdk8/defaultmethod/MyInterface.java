package com.javazx.jdk8.defaultmethod;

/**
 * @author: itmrchen
 * @Description: 默认方法
 * @date 2019/8/11 19:26
 */
public interface MyInterface {
    default void sayDefaultMethod() {
        System.out.println("MyInterface");
    }
}

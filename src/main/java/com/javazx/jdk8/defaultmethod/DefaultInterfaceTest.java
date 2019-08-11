package com.javazx.jdk8.defaultmethod;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/11 19:28
 */
public class DefaultInterfaceTest implements MyInterface, MyInterface1 {

    public static void main(String[] args) {
        DefaultInterfaceTest defaultInterfaceTest = new DefaultInterfaceTest();
        defaultInterfaceTest.sayDefaultMethod();
    }

    /**
     * 不重写会有问题
     */
    @Override
    public void sayDefaultMethod() {
        MyInterface.super.sayDefaultMethod();
    }
    /**
     * 实现类的级别会比接口的级别高 如果相同的方法会取实现类中的方法
     * 思考题：jdk8为什么要有默认方法，作用是什么？
     */
}

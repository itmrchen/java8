package com.javazx.jdk8;

/**
 * @author: itmrchen
 * @Description: 函数式接口
 * @date 2019/8/5 1:49
 */
@FunctionalInterface
interface MyInterface {
    void test();

    @Override
    String toString();
}

public class Test2 {
    public void myTest(MyInterface myInterface) {
        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.myTest(() -> System.out.println("MyTest"));
    }
}

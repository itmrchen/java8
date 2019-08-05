package com.javazx.jdk8;

import java.util.function.Function;

/**
 * @author: itmrchen
 * @Description:jdk8函数式编程
 * @date 2019/8/5 23:46
 */
public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute(2, value ->
                value * 2
        ));
        System.out.println(functionTest.convert(52, value -> String.valueOf(value + "hello javazx.com!")));
    }

    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}

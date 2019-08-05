package com.javazx.jdk8;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author: itmrchen
 * @Description: Function中的compose和andThen两个方法的使用
 * 如果是两个参数一个输出则用BiFunction
 * @date 2019/8/6 0:16
 */
public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 functionTest = new FunctionTest2();
        System.out.println(functionTest.compute(2, value -> value * 3, value -> value * value));
        System.out.println(functionTest.compute2(2, value -> value - 3, value -> value * value));

        System.out.println(functionTest.compute3(2, 3, (value1, value2) -> value1 + value2));

        System.out.println(functionTest.compute4(2, 3, (value1, value2) -> value1 + value2, value -> 2 * value));

    }

    /**
     * 先计算function2 再将结果与function1运算
     *
     * @param a
     * @param function1
     * @param function2
     * @return
     */
    public int compute(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    /**
     * 先计算function1 再将结果与function2运算
     *
     * @param a
     * @param function1
     * @param function2
     * @return
     */
    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    /**
     * 具体操作由调用者决定
     *
     * @param a
     * @param b
     * @param function
     * @return
     */
    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> function) {
        return function.apply(a, b);
    }

    /**
     * @param a
     * @param b
     * @param biFunction
     * @param function
     * @return
     */
    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }


}

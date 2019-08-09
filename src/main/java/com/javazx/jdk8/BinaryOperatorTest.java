package com.javazx.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/10 2:16
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest binaryOperatorTest = new BinaryOperatorTest();
        System.out.println(binaryOperatorTest.compute(1, 2, (a, b) -> a + b));

        System.out.println(binaryOperatorTest.getShort("hello", "javazx", Comparator.comparingInt(String::length)));

    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}

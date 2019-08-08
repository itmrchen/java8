package com.javazx.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author: itmrchen
 * @Description:Predicate用法
 * @date 2019/8/7 1:28
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;
        System.out.println(predicate.test("helloworld"));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PredicateTest predicateTest = new PredicateTest();
        System.out.println("-------------------偶数集合----------------------");
        predicateTest.conditionFilter(list, item -> item % 2 == 0);
        System.out.println("-------------------奇数集合----------------------");
        predicateTest.conditionFilter(list, item -> item % 2 != 0);
        System.out.println("-------------------数字大于5集合----------------------");
        predicateTest.conditionFilter(list, item -> item > 5);
        System.out.println("-------------------数字小于3集合----------------------");
        predicateTest.conditionFilter(list, item -> item < 3);
        System.out.println("-------------------全部集合----------------------");
        predicateTest.conditionFilter(list, item -> true);
        System.out.println("-------------------空集合----------------------");
        predicateTest.conditionFilter(list, item -> false);

        System.out.println("-------------------大于5的偶数集合----------------------");
        predicateTest.conditionFilter(list, item -> item > 5, item -> item % 2 == 0);


    }

    /**
     * 打印出满足条件的数值集合
     *
     * @param list
     * @param predicate
     */
    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        list.forEach(item -> {
            if (predicate.test(item)) {
                System.out.println(item);
            }
        });


    }

    /**
     * 还有 .or方法
     *
     * @param list
     * @param predicate1
     * @param predicate2
     */
    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        for (Integer item : list) {
            if (predicate1.and(predicate2).test(item)) {
                System.out.println(item);
            }

        }

    }
}

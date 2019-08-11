package com.javazx.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/11 1:43
 */
public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.forEach(item -> System.out.println(item));
        list.forEach(System.out::println);
    }
}

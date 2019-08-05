package com.javazx.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author: itmrchen
 * @Description: jdk8 lambda表达式
 * @date 2019/8/5 0:24
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("---------------------------------");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("---------------------------------");
        list.forEach(integer ->
                System.out.println(integer));
        System.out.println("-------------方法引用 method interface--------------------");
        //方法引用 method interface
        list.forEach(
                System.out::println);

        System.out.println("-------------线程lambda--------------------");
        new Thread(() ->
                System.out.println("1111")).start();

        System.out.println("-------------list中元素改大写--------------------");
        List<String> listString = Arrays.asList("aaa", "bbb", "ccc");
        //listString.forEach(str-> System.out.println(str.toUpperCase()));
        List<String> destList = new ArrayList<>();
        listString.forEach(item -> destList.add(item.toUpperCase()));
        destList.forEach(str -> System.out.println(str));

        System.out.println("-------------list中元素改大写 stream写法--------------------");
        listString.stream().map(item -> item.toUpperCase()).forEach(str -> System.out.println(str));
        listString.stream().map(String::toUpperCase).forEach(str -> System.out.println(str));


    }
}

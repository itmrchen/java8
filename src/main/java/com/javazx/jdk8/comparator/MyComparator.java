package com.javazx.jdk8.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/19 21:37
 */
public class MyComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "nihao", "welcome");
        //Collections.sort(list, (item1, item2)-> item1.length()-item2.length());
        //Collections.sort(list, Comparator.comparingInt(String::length).reversed());
        //Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());
        //list.sort(Comparator.comparingInt(String::length).reversed());
        //list.sort(Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
        //Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));
        //Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));
        Collections.sort(list,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));
        System.out.println(list);
    }


}

package com.javazx.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/16 2:01
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
        list.stream().mapToInt(item ->{
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length==5).findFirst().ifPresent(System.out::println);
        // 拆分单词 去重输出
        List<String> list1 = Arrays.asList("hello world", "world welcome", "hello world welcome");
        list1.stream().map(item ->item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out::println);

    }
}

package com.javazx.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author: itmrchen
 * @Description: 流操作
 * @date 2019/8/12 1:12
 */
public class StreamTest {
    public static void main(String[] args) {
        Stream stream1 = Stream.of("zhangsan", "lisi", "wangwu");

        String[] myArray = new String[]{"zhangsan", "lisi", "wangwu"};
        Stream stream2 = Stream.of(myArray);
        Stream stream3 = Arrays.stream(myArray);

        List<String> list = Arrays.asList(myArray);
        Stream stream4 = list.stream();

        IntStream.of(new int[]{5, 6, 7}).forEach(System.out::println);
        // 3-7
        IntStream.range(3, 8).forEach(System.out::println);
        // 3-8
        IntStream.rangeClosed(3, 8).forEach(System.out::println);

        // 每个元素乘以2再求和
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(integerList.stream().map(integer -> 2 * integer).reduce(0, Integer::sum));

    }
}

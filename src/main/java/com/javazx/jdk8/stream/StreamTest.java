package com.javazx.jdk8.stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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

        Stream<String> stringStream = Stream.of("hello", "world", "hello world");
        //String[] strArray = stringStream.toArray(length -> new String[length]);
        String[] strArray = stringStream.toArray(String[]::new);
        Arrays.asList(strArray).forEach(System.out::println);

        Stream<String> stringStream1 = Stream.of("hello", "world", "hello world");
        //List<String> stringList = stringStream1.collect(Collectors.toList());
        //上面的原始写法
        //List<String> stringList = stringStream1.collect(ArrayList::new, (theList, item) -> theList.add(item), (theList1, theList2) -> theList1.addAll(theList2));
        // 构造方法引用 +方法引用实现
        //List<String> stringList = stringStream1.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
        //List<String> stringList = stringStream1.collect(Collectors.toCollection(ArrayList::new));
        Set<String> stringSet = stringStream1.collect(Collectors.toCollection(TreeSet::new));
        //stringList.forEach(System.out::println);
        stringSet.forEach(System.out::println);
        Stream<String> stringStream2 = Stream.of("hello", "world", "hello world");
        String strBulider = stringStream2.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        System.out.println(strBulider);

        Stream<String> stringStream3 = Stream.of("hello", "world", "hello world");
        String joinString = stringStream3.collect(Collectors.joining());
        System.out.println(joinString);

        System.out.println("----------------------------------小写转大写输出--------------------------------------");
        List<String> listUp = Arrays.asList("aaa", "bbb");
        listUp.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

        Stream<List<Integer>> listStream = Stream.of(Arrays.asList(1), Arrays.asList(1, 2, 3), Arrays.asList(3, 4));
        listStream.flatMap(theList -> theList.stream()).map(item -> item * item).collect(Collectors.toList()).forEach(System.out::println);


        Stream<String> uuidStream = Stream.generate(UUID.randomUUID()::toString);
        uuidStream.findFirst().ifPresent(System.out::println);
        //无限串行流  所以一般加个limit的限制
        Stream.iterate(1, item -> item + 2).limit(6).forEach(System.out::println);
        System.out.println("------------------ continue test ---------------------");
        List<Integer> integerListTest = Arrays.asList(1, 2, 3, 4, 5, 6);
        integerListTest.forEach(item -> {
            if (item > 2 && item < 6) {
                return;
            } else {
                System.out.println(item);
            }
        });

    }
}

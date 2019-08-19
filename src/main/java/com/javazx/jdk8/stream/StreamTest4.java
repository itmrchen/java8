package com.javazx.jdk8.stream;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @author: itmrchen
 * @Description: 分组、分区
 * @date 2019/8/17 0:31
 */
public class StreamTest4 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 22, 100);
        Student student2 = new Student("lisi", 25, 65);
        Student student3 = new Student("wangwu", 27, 89);
        Student student4 = new Student("zhangsan", 29, 99);
        List<Student> list = Arrays.asList(student1, student2, student3, student4);
        /*Map<String,List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getName));*/
        /*Map<Integer,List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getScore));*/
        /*Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));*/
        /*Map<String,Double> map = list.stream().collect(Collectors.groupingBy(Student::getName,Collectors.averagingDouble(Student::getScore)));*/
        //分区
        Map<Boolean, List<Student>> map = list.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 90));
        System.out.println(map.toString());


        System.out.println(list.stream().collect(counting()));
        System.out.println(list.stream().count());

        System.out.println("-------------------------------------");
        list.stream().collect(minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        System.out.println(list.stream().collect(averagingInt(Student::getScore)));
        System.out.println(list.stream().collect(summingInt(Student::getScore)));
        IntSummaryStatistics intSummaryStatistics = list.stream().collect(summarizingInt(Student::getScore));
        System.out.println(intSummaryStatistics);
        System.out.println("-----------------字符串拼接--------------------");
        System.out.println(list.stream().map(Student::getName).collect(joining(",")));
        System.out.println(list.stream().map(Student::getName).collect(joining(",", "[", "]")));
        System.out.println("-----------------分组、分区--------------------");
        Map<Integer, Map<String, List<Student>>> map1 = list.stream().collect(groupingBy(Student::getScore, groupingBy(Student::getName)));
        System.out.println(map1);
        Map<Boolean, List<Student>> mapPar = list.stream().collect(partitioningBy(student -> student.getScore() > 70));
        System.out.println(mapPar);
        Map<Boolean, Long> map4 = list.stream().collect(partitioningBy(student -> student.getScore() > 80, counting()));
        System.out.println(map4);
        Map<String, Student> map5 = list.stream().collect(groupingBy(Student::getName, collectingAndThen(minBy(Comparator.comparingInt(Student::getScore)), Optional::get)));
        System.out.println(map5);


    }
}

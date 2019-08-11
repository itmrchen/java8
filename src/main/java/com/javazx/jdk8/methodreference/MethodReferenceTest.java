package com.javazx.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author: itmrchen
 * @Description: 方法引用
 * @date 2019/8/11 18:31
 */
public class MethodReferenceTest {
    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }


    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 11);
        Student student2 = new Student("lisi", 21);
        Student student3 = new Student("wangwu", 10);
        Student student4 = new Student("zhaoliu", 19);

        List<Student> studentList = Arrays.asList(student1, student2, student3, student4);
        System.out.println("------------------------Lambda表达式写法------------------------------");
        studentList.sort((student1Param, student2Param) -> Student.compareStudentByAge(student1Param, student2Param));
        studentList.forEach(student -> System.out.println(student.getAge()));
        System.out.println("------------------------静态方法引用写法------------------------------");
        studentList.sort(Student::compareStudentByAge);
        studentList.forEach(student -> System.out.println(student.getAge()));
        System.out.println("----------------------------------------------------------------------");
        studentList.sort(Student::compareStudentByName);
        studentList.forEach(student -> System.out.println(student.getName()));

        System.out.println("------------------------实例方法引用写法------------------------------");
        StudentCompare studentCompare = new StudentCompare();
        studentList.sort(studentCompare::compareStudentByAge);
        studentList.forEach(student -> System.out.println(student.getAge()));

        System.out.println("------------------------类-实例方法引用写法 第一个参数作为方法的调用方 第二个作为方法的参数------------------------------");
        studentList.sort(Student::compareByAge);
        studentList.forEach(student -> System.out.println(student.getAge()));

        List<String> cities = Arrays.asList("shanghai", "tainjin", "chongqing", "xiamen");
        cities.sort(String::compareToIgnoreCase);
        cities.forEach(System.out::println);

        System.out.println("------------------------构造方法引用写法------------------------------");
        MethodReferenceTest methodReferenceTest = new MethodReferenceTest();
        System.out.println(methodReferenceTest.getString(String::new));
        System.out.println(methodReferenceTest.getString2("hello", String::new));


    }
}

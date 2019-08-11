package com.javazx.jdk8.methodreference;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/11 18:28
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int compareStudentByAge(Student student1, Student student2) {
        return student1.getAge() - student2.getAge();
    }

    public static int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareByAge(Student student) {
        return this.getAge() - student.getAge();
    }

    public int compareByName(Student student) {
        return this.getName().compareToIgnoreCase(student.getName());
    }
}

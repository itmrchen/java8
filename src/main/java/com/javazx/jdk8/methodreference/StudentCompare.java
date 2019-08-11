package com.javazx.jdk8.methodreference;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/11 18:44
 */
public class StudentCompare {
    public int compareStudentByAge(Student student1, Student student2) {
        return student1.getAge() - student2.getAge();
    }

    public int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}

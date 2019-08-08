package com.javazx.jdk8;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/6 1:31
 */

public class Person {
    private String username;
    private int age;

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

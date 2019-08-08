package com.javazx.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/6 1:32
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 12);
        Person person2 = new Person("lisi", 22);
        Person person3 = new Person("wangwu", 42);
        List<Person> personList = Arrays.asList(person1, person2, person3);
        PersonTest personTest = new PersonTest();
        List<Person> list = personTest.getPersonListByName("zhangsan", personList);
        list.forEach(person -> System.out.println(person.getUsername()));
        System.out.println("-------------------------------------------------------------------");
        List<Person> list1 = personTest.getPersonListByAge(13, personList);
        list1.forEach(person -> System.out.println(person.getUsername()));
        System.out.println("-------------------------------------灵活写法------------------------------");
        List<Person> personResult = personTest.getPersonListByAge2(20,personList,(age,listP)->{
            return personList.stream().filter(person -> person.getAge()>age).collect(Collectors.toList());
        });
        personResult.forEach(person -> System.out.println(person.getUsername()));

    }

    public List<Person> getPersonListByName(String username, List<Person> personList) {
        return personList.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonListByAge(int age, List<Person> personList) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (agePerson, personL) -> {
            return personL.stream().filter(person -> person.getAge() > agePerson).collect(Collectors.toList());
        };
        return biFunction.apply(age, personList);
    }

    /**
     * 更加的灵活
     *
     * @param age
     * @param personList
     * @return
     */
    public List<Person> getPersonListByAge2(int age, List<Person> personList, BiFunction<Integer, List<Person>, List<Person>> biFunction) {

        return biFunction.apply(age, personList);
    }

}

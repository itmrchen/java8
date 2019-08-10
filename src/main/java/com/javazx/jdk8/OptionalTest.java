package com.javazx.jdk8;

import java.util.Optional;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/11 1:11
 */
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        Optional<String> optional2 = Optional.empty();

        // 这种写法不推荐
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        // 推荐函数式编程写法
        optional.ifPresent(item -> System.out.println(item));
        optional2.ifPresent(item -> System.out.println(item));
        System.out.println(optional2.orElse("为空"));
        System.out.println(optional2.orElseGet(() -> "你好"));

    }
}

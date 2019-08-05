package com.javazx.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/5 20:50
 */
public class StirngComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(names);
        System.out.println("-----------------------lambda写法-------------------------------");
        /*Collections.sort(names, (o1, o2) ->
                o2.compareTo(o1)
        );*/
        Collections.sort(names, Comparator.reverseOrder()
        );
        System.out.println(names);

    }
}

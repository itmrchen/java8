package com.javazx.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author: itmrchen
 * @Description: 串行流与并行流的比较
 * @date 2019/8/16 1:46
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(500000000);
        for (int i = 0; i < list.size(); i++) {
            list.add(UUID.randomUUID().toString());
        }
        System.out.println("开始排序");
        long startTime = System.nanoTime();
        //list.stream().sorted().findFirst();
        list.parallelStream().sorted().findFirst();
        long endTime = System.nanoTime();
        long time = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("耗时：" + time);

    }
}

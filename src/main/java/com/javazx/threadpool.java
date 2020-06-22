package com.javazx;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: itmrchen
 * @Description:
 * @date 2019/8/21 14:35
 */
public class threadpool {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("111","222");
        System.out.println(System.currentTimeMillis());
        //任务执行计数器
        AtomicInteger count = new AtomicInteger(1);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        for (int i = 0; i < list.size(); i++) {

            String aa = list.get(i);
            scheduledExecutorService.scheduleWithFixedDelay(() -> {
                int currCount = count.getAndIncrement();
                System.out.println(Thread.currentThread().getName());
                System.out.println(System.currentTimeMillis()/1000 + "第" + currCount + "次" + "开始执行");
                get(aa);
                System.out.println(System.currentTimeMillis()/1000 + "第" + currCount + "次" + "执行结束");
            }, 1, 1, TimeUnit.SECONDS).cancel(true);
        }

    }

    public static void get(String str){
        System.out.println(str);
    }
}

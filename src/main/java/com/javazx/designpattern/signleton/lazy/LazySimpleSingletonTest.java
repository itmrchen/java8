package com.javazx.designpattern.signleton.lazy;

/**
 * 测试类
 *
 * @author itmrchen
 * @date 2020/6/22 20:46
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExecutorThread());
        Thread thread2 = new Thread(new ExecutorThread());
        thread1.start();
        thread2.start();
        System.out.println("executor end!");
    }
}

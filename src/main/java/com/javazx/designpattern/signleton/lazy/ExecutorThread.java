package com.javazx.designpattern.signleton.lazy;

/**
 * @author itmrchen
 * @date 2020/6/22 20:47
 */
public class ExecutorThread implements Runnable {
    @Override
    public void run() {
        //LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        //LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        LazyInnerClassSingleton lazy = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazy);

    }
}

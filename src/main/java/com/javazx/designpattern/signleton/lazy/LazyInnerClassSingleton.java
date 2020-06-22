package com.javazx.designpattern.signleton.lazy;

/**
 * @author itmrchen
 * @date 2020/6/23 1:48
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("禁止创建多个实例");
        }
    }

    /**
     * 1、懒汉式单例
     * 2、LazyHolder里面的逻逻辑需要等到外部方法调用时才执行
     * 3、巧妙地利用了内部类的特性
     * 4、JVM底层执行逻辑，完美地避开了线程安全的问题
     *
     * @return
     */
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}

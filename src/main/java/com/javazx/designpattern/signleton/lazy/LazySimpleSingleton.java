package com.javazx.designpattern.signleton.lazy;

/**
 * 懒汉式单例 [方便理解，比较懒，什么时间用 什么时间创建]
 *
 * @author chenbo
 * @date 2020/6/22 20:40
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton() {
    }

    public synchronized static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}

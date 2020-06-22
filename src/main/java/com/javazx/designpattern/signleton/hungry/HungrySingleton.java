package com.javazx.designpattern.signleton.hungry;

/**
 * 饿汉式[加深记忆，比较饿上来就要创建好，吃]
 * 缺点：浪费内存空间
 *
 * @author itmrchen
 * @date 2020/6/22 20:32
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}

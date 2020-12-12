package com.xicheng.designpattern.p01_singleton;

/**
 * description 懒汉式
 *
 * @author xichengxml
 * @date 2020-12-12 22:04
 */
public class T02_Singleton {

    private static T02_Singleton T02_SINGLETON = null;

    private T02_Singleton() {
    }

    public synchronized static T02_Singleton getInstance() {
        if (T02_SINGLETON == null) {
            T02_SINGLETON = new T02_Singleton();
        }
        return T02_SINGLETON;
    }
}

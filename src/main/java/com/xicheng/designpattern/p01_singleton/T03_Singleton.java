package com.xicheng.designpattern.p01_singleton;

/**
 * description 双重校验方式
 *
 * @author xichengxml
 * @date 2020-12-12 22:09
 */
public class T03_Singleton {

    private static T03_Singleton T03_SINGLETON = null;

    private T03_Singleton() {
    }

    public static T03_Singleton getInstance() {
        if (T03_SINGLETON == null) {
            synchronized (T03_Singleton.class) {
                if (T03_SINGLETON == null) {
                    T03_SINGLETON = new T03_Singleton();
                }
            }
        }
        return T03_SINGLETON;
    }
}

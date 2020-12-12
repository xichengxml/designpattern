package com.xicheng.designpattern.p01_singleton;

/**
 * description 饿汉式
 *
 * @author xichengxml
 * @date 2020-12-12 21:57
 */
public class T01_Singleton {

    private static T01_Singleton T01_SINGLETON = new T01_Singleton();

    private T01_Singleton() {

    }

    public static T01_Singleton getInstance() {
        return T01_SINGLETON;
    }
}

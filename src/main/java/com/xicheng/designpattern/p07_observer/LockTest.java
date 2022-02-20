package com.xicheng.designpattern.p07_observer;

/**
 * @description
 * @author xichengxml
 * @date 2021-04-11 15:17:04
 */
public class LockTest {

    private static final Object o = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (o) {
                o.notifyAll();
                System.out.println("b");
            }
        }).start();

        new Thread(() -> {
            synchronized (o) {
                try {
                    o.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("a");
            }
        }).start();


    }
}

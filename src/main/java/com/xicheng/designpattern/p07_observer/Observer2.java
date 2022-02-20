package com.xicheng.designpattern.p07_observer;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/2/13 上午 06:18
 */
public class Observer2 implements Observer {
    @Override
    public void update(Object o) {
        System.out.println("This is observer2: " + o);
    }
}

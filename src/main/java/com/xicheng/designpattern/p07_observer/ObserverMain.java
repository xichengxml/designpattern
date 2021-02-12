package com.xicheng.designpattern.p07_observer;

/**
 * description
 * 当对象的更改可能需要更改其他对象数据，而其他对象事先未知动态更改时，请使用观察者
 * 优点：
 * 1. 符合开闭原则
 * 2. 可以在运行时建立对象之间的关系
 * 应用：
 * {@link java.util.Observable}
 * {@link org.springframework.context.ApplicationListener}
 *
 * @author xichengxml
 * @date 2021/2/13 上午 06:11
 */
public class ObserverMain {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.notifyObserver("event 1");
    }
}

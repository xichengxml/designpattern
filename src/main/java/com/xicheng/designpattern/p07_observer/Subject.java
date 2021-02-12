package com.xicheng.designpattern.p07_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/2/13 上午 06:10
 */
public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver(Object event) {
        for (Observer observer : observerList) {
            observer.update(event);
        }
    }
}

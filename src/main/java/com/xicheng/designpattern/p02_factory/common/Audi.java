package com.xicheng.designpattern.p02_factory.common;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 18:50
 */
public class Audi implements Car {

    @Override
    public void run() {
        System.out.println("Audi is running...");
    }
}

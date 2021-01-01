package com.xicheng.designpattern.p02_factory;

import com.xicheng.designpattern.p02_factory.common.Car;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 19:46
 */
public class T03_SimpleFactoryTest {

    public void baseTest() {
        Car audi = T02_SimpleFactory.createAudi();
        Car byd = T02_SimpleFactory.createByd();

        audi.run();
        byd.run();
    }
}

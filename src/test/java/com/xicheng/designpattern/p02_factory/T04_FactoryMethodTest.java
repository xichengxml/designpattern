package com.xicheng.designpattern.p02_factory;

import com.xicheng.designpattern.p02_factory.common.Car;
import org.junit.Test;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 20:07
 */
public class T04_FactoryMethodTest {

    @Test
    public void baseTest() {
        Car c1 = new T03_AudiFacotory().createCar();
        Car c2 = new T03_BydFactory().createCar();

        c1.run();
        c2.run();
    }
}

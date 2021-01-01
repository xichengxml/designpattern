package com.xicheng.designpattern.p02_factory;

import com.xicheng.designpattern.p02_factory.common.Car;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 19:44
 */
@Slf4j
public class T02_SimpleFatoryTest {

    @Test
    public void baseTest() {
        Car c1 = T01_SimpleFactory.createCar("奥迪");
        Car c2 = T01_SimpleFactory.createCar("比亚迪");

        c1.run();
        c2.run();
    }
}

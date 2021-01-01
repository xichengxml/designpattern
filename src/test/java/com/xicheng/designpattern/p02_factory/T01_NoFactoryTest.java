package com.xicheng.designpattern.p02_factory;

import com.xicheng.designpattern.p02_factory.common.Audi;
import com.xicheng.designpattern.p02_factory.common.Byd;
import com.xicheng.designpattern.p02_factory.common.Car;
import org.junit.Test;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 18:51
 */
public class T01_NoFactoryTest {

    @Test
    private static void baseTest() {
        Car c1 = new Audi();
        Car c2 = new Byd();

        c1.run();
        c2.run();
    }
}

package com.xicheng.designpattern.p03_decorator;

import org.junit.Test;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 23:40
 */
public class T01_ICarTest {

    @Test
    public void carTest() {
        Car car = new Car();
        car.move();
    }

    @Test
    public void flyCarTest() {
        FlyCar flyCar = new FlyCar(new Car());
        flyCar.move();
    }

    @Test
    public void flySwimCarTest() {
        FlyCar flyCar = new FlyCar(new WaterCar(new Car()));
        flyCar.move();
    }
}

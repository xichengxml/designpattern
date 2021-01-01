package com.xicheng.designpattern.p02_factory;

import org.junit.Test;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 20:56
 */
public class T05_AbstractFactoryTest {

    @Test
    public void baseTest() {
        T04_Engine engine = new T04_LowCarFactory().createEngine();
        T04_Seat seat = new T04_LowCarFactory().createSeat();
        T04_Tyre tyre = new T04_LowCarFactory().createTyre();

        engine.start();
        seat.paint();
        tyre.revolve();
    }
}

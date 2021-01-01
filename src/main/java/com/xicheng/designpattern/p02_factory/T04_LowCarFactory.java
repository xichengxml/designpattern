package com.xicheng.designpattern.p02_factory;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 20:55
 */
public class T04_LowCarFactory implements T04_CarFactory {

    @Override
    public T04_Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public T04_Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public T04_Tyre createTyre() {
        return new LowTyre();
    }
}

package com.xicheng.designpattern.p02_factory;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 20:56
 */
public class T04_LuxuryCarFactory implements T04_CarFactory {
    @Override
    public T04_Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public T04_Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public T04_Tyre createTyre() {
        return new LuxuryTyre();
    }
}

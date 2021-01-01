package com.xicheng.designpattern.p02_factory;

/**
 * description 抽象工厂模式
 *
 * @author xichengxml
 * @date 2021-01-01 20:53
 */
public interface T04_CarFactory {

    T04_Engine createEngine();

    T04_Seat createSeat();

    T04_Tyre createTyre();
}

package com.xicheng.designpattern.p02_factory;

import com.xicheng.designpattern.p02_factory.common.Audi;
import com.xicheng.designpattern.p02_factory.common.Car;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 20:05
 */
public class T03_AudiFacotory implements T03_FactoryMethod {
    @Override
    public Car createCar() {
        return new Audi();
    }
}

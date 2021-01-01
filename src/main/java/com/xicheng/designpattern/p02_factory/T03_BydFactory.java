package com.xicheng.designpattern.p02_factory;

import com.xicheng.designpattern.p02_factory.common.Byd;
import com.xicheng.designpattern.p02_factory.common.Car;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 20:06
 */
public class T03_BydFactory implements T03_FactoryMethod {
    @Override
    public Car createCar() {
        return new Byd();
    }
}

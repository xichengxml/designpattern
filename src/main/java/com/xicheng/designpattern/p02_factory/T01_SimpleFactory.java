package com.xicheng.designpattern.p02_factory;

import com.xicheng.designpattern.p02_factory.common.Audi;
import com.xicheng.designpattern.p02_factory.common.Byd;
import com.xicheng.designpattern.p02_factory.common.Car;

/**
 * description 简单工厂模式
 *
 * @author xichengxml
 * @date 2021-01-01 19:10
 */
public class T01_SimpleFactory {

    public static Car createCar(String type) {
        switch (type) {
            case "奥迪":
                return new Audi();
            case "比亚迪":
                return new Byd();
            default:
                return null;
        }
    }
}

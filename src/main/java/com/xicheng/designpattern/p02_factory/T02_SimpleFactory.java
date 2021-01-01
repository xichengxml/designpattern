package com.xicheng.designpattern.p02_factory;

import com.xicheng.designpattern.p02_factory.common.Audi;
import com.xicheng.designpattern.p02_factory.common.Byd;
import com.xicheng.designpattern.p02_factory.common.Car;

/**
 * description 简单工厂模式2
 *
 * @author xichengxml
 * @date 2021-01-01 19:43
 */
public class T02_SimpleFactory {

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }
}

package com.xicheng.designpattern.p04_proxy;

import com.xicheng.designpattern.p04_proxy.common.Movable;
import com.xicheng.designpattern.p04_proxy.common.Tank;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * description 给run方法既要加日志，又要打印运行时间，先后顺序还要调换
 * 两个代理类分别实现movable，同时引用改成movable
 * 静态代理，越来越像装饰模式了
 * @author xichengxml
 * @date 2011/1/16 下午 05:50
 */
public class T04_Proxy04 {

    public static void main(String[] args) {
        // 先日志后时间
        TankLog03 tankLog03 = new TankLog03(new TankRunTime03(new Tank()));
        tankLog03.run();
        // 先时间后日志
        TankRunTime03 tankRunTime03 = new TankRunTime03(new TankLog03(new Tank()));
        tankRunTime03.run();
    }
}

@Data
@AllArgsConstructor
class TankLog03 implements Movable {
    private Movable movable;

    @Override
    public void run() {
        System.out.println("start run");
        movable.run();
        System.out.println("stop run");
    }
}

@Data
@AllArgsConstructor
class TankRunTime03 implements Movable {

    private Movable movable;

    @Override
    public void run() {
        System.out.println("start time: " + System.currentTimeMillis());
        movable.run();
        System.out.println("end time: " + System.currentTimeMillis());
    }
}

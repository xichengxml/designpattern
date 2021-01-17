package com.xicheng.designpattern.p04_proxy;

import com.xicheng.designpattern.p04_proxy.common.Tank;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * description 给run方法加日志，统计执行时间
 * 使用组合的方式
 *
 * @author xichengxml
 * @date 2021/1/16 下午 05:50
 */
public class T03_Proxy03 {

    public static void main(String[] args) {
        TankLog02 tankLog02 = new TankLog02(new Tank());
        tankLog02.run();
        TankRunTime02 tankRunTime02 = new TankRunTime02(new Tank());
        tankRunTime02.run();
    }
}

@Data
@AllArgsConstructor
class TankLog02 {
    private Tank tank;

    public void run() {
        System.out.println("start run");
        tank.run();
        System.out.println("stop run");
    }
}

@Data
@AllArgsConstructor
class TankRunTime02 {

    private Tank tank;

    public void run() {
        long start = System.currentTimeMillis();
        tank.run();
        System.out.println("run time: " + (System.currentTimeMillis() - start));
    }
}

package com.xicheng.designpattern.p04_proxy;

import com.xicheng.designpattern.p04_proxy.common.Tank;

/**
 * description 给run方法加日志，统计执行时间
 * 使用继承的方式
 * 但是在实际开发代码中要慎用继承
 *
 * @author xichengxml
 * @date 2021/1/16 下午 05:50
 */
public class T02_Proxy02 {

    public static void main(String[] args) {
        TankLog01 tankLog01 = new TankLog01();
        tankLog01.run();
        TankRunTime01 tankRunTime01 = new TankRunTime01();
        tankRunTime01.run();
    }
}

class TankLog01 extends Tank {
    @Override
    public void run() {
        System.out.println("start run");
        super.run();
        System.out.println("stop run");
    }
}

class TankRunTime01 extends Tank {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        super.run();
        System.out.println("run time: " + (System.currentTimeMillis() - start));
    }
}

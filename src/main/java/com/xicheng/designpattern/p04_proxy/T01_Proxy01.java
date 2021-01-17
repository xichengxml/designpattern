package com.xicheng.designpattern.p04_proxy;

import com.xicheng.designpattern.p04_proxy.common.Tank;

/**
 * description 给run方法加日志，统计执行时间
 * 最简单的方式就是修改源码，增加代码，如果源码无法修改怎么办
 *
 * @author xichengxml
 * @date 2021/1/16 下午 05:48
 */
public class T01_Proxy01 {

    public static void main(String[] args) {
        Tank tank01 = new Tank();
        tank01.run();
    }
}


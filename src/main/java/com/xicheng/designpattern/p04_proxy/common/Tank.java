package com.xicheng.designpattern.p04_proxy.common;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/1/16 下午 06:03
 */
public class Tank implements Movable {
    @Override
    public void run() {
        System.out.println("claclacla");
        try {
            // 随机睡眠一段时间
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

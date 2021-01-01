package com.xicheng.designpattern.p02_factory;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 20:27
 */
public interface T04_Engine {

    void start();
}

class LowEngine implements T04_Engine {
    @Override
    public void start() {
        System.out.println("low engine start...");
    }
}

class LuxuryEngine implements T04_Engine {
    @Override
    public void start() {
        System.out.println("luxury engine start...");
    }
}

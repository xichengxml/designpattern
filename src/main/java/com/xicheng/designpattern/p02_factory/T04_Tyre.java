package com.xicheng.designpattern.p02_factory;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 20:29
 */
public interface T04_Tyre {

    void revolve();
}

class LowTyre implements T04_Tyre {
    @Override
    public void revolve() {
        System.out.println("low tyre revolving...");
    }
}

class LuxuryTyre implements T04_Tyre {
    @Override
    public void revolve() {
        System.out.println("luxury tyre revolving...");
    }
}
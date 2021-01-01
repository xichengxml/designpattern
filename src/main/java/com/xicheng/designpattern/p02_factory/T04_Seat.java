package com.xicheng.designpattern.p02_factory;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 20:31
 */
public interface T04_Seat {

    void paint();
}

class LowSeat implements T04_Seat {
    @Override
    public void paint() {
        System.out.println("low seat paint...");
    }
}

class LuxurySeat implements T04_Seat {
    @Override
    public void paint() {
        System.out.println("luxury seat paint...");
    }
}
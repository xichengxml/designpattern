package com.xicheng.designpattern.p03_decorator;

/**
 * description
 *
 * @author xichengxml
 * @date 2021-01-01 23:31
 */
// 抽象组件
public interface T01_ICar {

    void move();
}

// 真实构建
class Car implements T01_ICar {
    @Override
    public void move() {
        System.out.println("This is a common car...");
    }
}

// Decorator装饰角色
class SuperCar implements T01_ICar {

    protected T01_ICar iCar;

    public SuperCar(T01_ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void move() {
        iCar.move();
    }
}

class FlyCar extends SuperCar {

    public FlyCar(T01_ICar iCar) {
        super(iCar);
    }

    private void fly() {
        System.out.println("This is a fly car...");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

class WaterCar extends SuperCar {
    public WaterCar(T01_ICar iCar) {
        super(iCar);
    }

    private void swim() {
        System.out.println("This is a water car...");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

class AiCar extends SuperCar {
    public AiCar(T01_ICar iCar) {
        super(iCar);
    }

    private void autoMove() {
        System.out.println("This is an ai car...");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}



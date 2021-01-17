package com.xicheng.designpattern.p04_proxy;

import com.xicheng.designpattern.p04_proxy.common.Movable;
import com.xicheng.designpattern.p04_proxy.common.Tank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * description 支持任意接口类型的jdk动态代理
 * 给run方法既要加日志，又要打印运行时间，先后顺序还要调换
 * 两个代理类分别实现movable，同时引用改成movable
 * 静态代理，越来越像装饰模式了
 * 我们还想让代理的对象丰富一点，不止movable类型
 * jdk动态代理
 * jdk动态代理原理分析
 * 支持任意接口类型的jdk动态代理
 * @author xichengxml
 * @date 2021/1/16 下午 05:50
 */
public class T07_Proxy07 {

    public static void main(String[] args) {
        Movable movable = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class}, new TankLog06<Tank>(new Tank()));
        Flyable flyable = (Flyable) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Flyable.class}, new TankLog06<Plane>(new Plane()));
        movable.run();
        flyable.fly();
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class TankLog06<T> implements InvocationHandler {

    private T t;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start");
        System.out.println(Arrays.toString(proxy.getClass().getMethods()));
        Object result = method.invoke(t, args);
        System.out.println("stop");
        return result;
    }
}

@Data
@AllArgsConstructor
class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("wengwengweng...");
    }
}

interface Flyable {
    void fly();
}

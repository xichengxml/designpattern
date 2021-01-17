package com.xicheng.designpattern.p04_proxy;

import com.xicheng.designpattern.p04_proxy.common.Movable;
import com.xicheng.designpattern.p04_proxy.common.Tank;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * description 给run方法既要加日志，又要打印运行时间，先后顺序还要调换
 * 两个代理类分别实现movable，同时引用改成movable
 * 静态代理，越来越像装饰模式了
 * 我们还想让代理的对象丰富一点，不止movable类型
 * jdk动态代理
 * @author xichengxml
 * @date 2021/1/16 下午 05:50
 */
public class T05_Proxy05 {

    public static void main(String[] args) {
        Movable movable = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class}, new TankLog04(new Tank()));
        movable.run();
    }
}

@Data
@AllArgsConstructor
class TankLog04 implements InvocationHandler {

    private Movable movable;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start");
        System.out.println(Arrays.toString(proxy.getClass().getMethods()));
        Object result = method.invoke(movable, args);
        System.out.println("stop");
        return result;
    }
}

@Data
@AllArgsConstructor
class TankRunTime04 implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start time: " + System.currentTimeMillis());
        Object result = method.invoke(proxy, args);
        System.out.println("stop time: " + System.currentTimeMillis());
        return result;
    }
}

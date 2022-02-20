package com.xicheng.designpattern.p04_proxy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

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

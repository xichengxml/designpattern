package com.xicheng.designpattern.p04_proxy;

import com.xicheng.designpattern.p04_proxy.common.Tank;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * description cglib动态代理
 * 给run方法既要加日志，又要打印运行时间，先后顺序还要调换
 * 两个代理类分别实现movable，同时引用改成movable
 * 静态代理，越来越像装饰模式了
 * 我们还想让代理的对象丰富一点，不止movable类型
 * jdk动态代理
 * jdk动态代理原理分析
 * 支持任意接口类型的jdk动态代理
 * cglib动态代理
 * @author xichengxml
 * @date 2021/1/16 下午 05:50
 */
public class T08_Proxy08 {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TankLog07());
        Tank tank = (Tank)enhancer.create();
        tank.run();
    }
}

@Data
@AllArgsConstructor
class TankLog07 implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("start");
        // method.invoke(obj, args); 会不断递归调用自己
        System.out.println(method.getName() + "--" + Arrays.toString(method.getParameterTypes()));
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("stop");

        return result;
    }
}


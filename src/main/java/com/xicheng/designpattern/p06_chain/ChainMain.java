package com.xicheng.designpattern.p06_chain;

import javax.servlet.FilterChain;

/**
 * description 使用场景：一个请求需要一个或多个对象协作处理
 * 优点：1. 请求的发送者和接收者解耦
 *      2. 可以控制执行顺序
 *      3. 符合开闭原则和单一职责原则
 * 应用场景：{@link FilterChain}
 * 使用的是数组的方式，通过下标来访问
 * org.apache.catalina.core.ApplicationFilterChain#internalDoFilter()
 *
 * @author xichengxml
 * @date 2021/2/10 下午 10:38
 */
public class ChainMain {

    public static void main(String[] args) {
        ChainRequest chainRequest = new ChainRequest();
        chainRequest.setAuthorityLimit(true);
        chainRequest.setFrequencyLimit(true);
        chainRequest.setSensitiveWordLimit(true);

        FrequencyLimitHandler frequencyLimitHandler = new FrequencyLimitHandler();
        AuthorityHandler authorityHandler = new AuthorityHandler();
        SensitiveWordsHandler sensitiveWordsHandler = new SensitiveWordsHandler();

        frequencyLimitHandler.setNext(authorityHandler);
        authorityHandler.setNext(sensitiveWordsHandler);

        System.out.println(frequencyLimitHandler.process(chainRequest));
    }
}

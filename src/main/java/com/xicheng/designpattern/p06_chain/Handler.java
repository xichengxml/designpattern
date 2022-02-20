package com.xicheng.designpattern.p06_chain;

/**
 * description 接口定义，承担责任
 *
 * @author xichengxml
 * @date 2021/2/10 下午 10:49
 */
public interface Handler {

    boolean process(ChainRequest request);
}

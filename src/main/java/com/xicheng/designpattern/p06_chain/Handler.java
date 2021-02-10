package com.xicheng.designpattern.p06_chain;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/2/10 下午 10:49
 */
public interface Handler {

    abstract boolean process(ChainRequest request);
}

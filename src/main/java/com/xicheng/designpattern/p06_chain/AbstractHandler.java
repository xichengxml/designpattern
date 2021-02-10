package com.xicheng.designpattern.p06_chain;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/2/10 下午 10:49
 */
public abstract class AbstractHandler implements Handler {

    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public abstract boolean process(ChainRequest request);

}

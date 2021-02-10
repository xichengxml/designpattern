package com.xicheng.designpattern.p06_chain;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/2/10 下午 10:48
 */
public class FrequencyLimitHandler extends AbstractHandler {

    @Override
    public boolean process(ChainRequest request) {
        System.out.println(getClass());
        if (!request.isFrequencyLimit()) {
            return false;
        }
        Handler next = this.getNext();
        if (next == null) {
            return true;
        }
        return next.process(request);
    }
}

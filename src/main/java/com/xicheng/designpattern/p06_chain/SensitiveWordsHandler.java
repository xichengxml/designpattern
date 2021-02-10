package com.xicheng.designpattern.p06_chain;

/**
 * description
 *
 * @author xichengxml
 * @date 2021/2/10 下午 10:54
 */
public class SensitiveWordsHandler extends AbstractHandler {

    @Override
    public boolean process(ChainRequest request) {
        System.out.println(getClass());
        if (!request.isSensitiveWordLimit()) {
            return false;
        }
        Handler next = this.getNext();
        if (null == next) {
            return true;
        }
        return next.process(request);
    }
}

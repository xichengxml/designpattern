package com.xicheng.designpattern.p06_chain;

import lombok.Data;

/**
 * description 直接通过类的属性来控制，简单模拟
 *
 * @author xichengxml
 * @date 2021/2/10 下午 10:45
 */
@Data
public class ChainRequest {

    /**
     * 登录频率限制
     */
    private boolean frequencyLimit;

    /**
     * 权限控制
     */
    private boolean authorityLimit;

    /**
     * 敏感词控制
     */
    private boolean sensitiveWordLimit;
}

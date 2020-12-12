package com.xicheng.designpattern.p01_singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * description
 *
 * @author xichengxml
 * @date 2020-12-12 21:59
 */
@Slf4j
public class T01_SingletonTest {

    @Test
    public void baseTest() {
        T01_Singleton instance01 = T01_Singleton.getInstance();
        T01_Singleton instance02 = T01_Singleton.getInstance();
        log.info("T01_SingletonTest baseTest instance01: {}， instance02: {}", instance01.hashCode(), instance02.hashCode());
    }
}

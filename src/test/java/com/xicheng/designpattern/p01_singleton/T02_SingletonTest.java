package com.xicheng.designpattern.p01_singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * description
 *
 * @author xichengxml
 * @date 2020-12-12 22:07
 */
@Slf4j
public class T02_SingletonTest {

    @Test
    public void baseTest() {
        T02_Singleton instance01 = T02_Singleton.getInstance();
        T02_Singleton instance02 = T02_Singleton.getInstance();
        log.info("T02_SingletonTest baseTest result: {}", instance01 == instance02);
    }
}

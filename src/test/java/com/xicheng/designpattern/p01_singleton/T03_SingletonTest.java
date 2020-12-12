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
public class T03_SingletonTest {

    @Test
    public void baseTest() {
        T03_Singleton instance01 = T03_Singleton.getInstance();
        T03_Singleton instance02 = T03_Singleton.getInstance();
        log.info("T03_SingletonTest baseTest result: {}", instance01 == instance02);
    }
}

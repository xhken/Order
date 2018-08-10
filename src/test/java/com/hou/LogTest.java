package com.hou;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ken on 2018/7/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@RestController
public class LogTest {
//    private final Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    @RequestMapping(value = "/hello")
    public void test1() {
        String name = "xiaohou";
        int password = 123456;
        log.debug("debug...");
        log.info("info... name:{} password{}", name, password);
        log.error("error...");
    }

    @Test
    public void testLog() {
        log.info("googo");
    }

}

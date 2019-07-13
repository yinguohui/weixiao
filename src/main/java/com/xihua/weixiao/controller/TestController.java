package com.xihua.weixiao.controller;

import com.xihua.weixiao.entiy.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName TestController
 * @Auhtor ygh
 * @DATE 2019/7/12 13:59
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    private final People people;

    private Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    public TestController(People people) {
        this.people = people;
    }
    @GetMapping("hello")
    public String hello(){
        logger.info("===============================");
        logger.info(people.toString());
        logger.info("===============================");
        return "hello"+people.toString();
    }
}

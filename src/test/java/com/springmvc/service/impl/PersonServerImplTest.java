package com.springmvc.service.impl;

import com.springmvc.service.PersonServer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhoubo on 7/28/2017.
 */
public class PersonServerImplTest {
    @Test
    public void save() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-aop.xml");
        PersonServer bean = ctx.getBean(PersonServer.class);
        bean.save("badMonkey",23);
    }

}
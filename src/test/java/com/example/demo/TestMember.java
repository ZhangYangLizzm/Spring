package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMember {

    @Test
    public void testMember() {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

        Member member = (Member) context.getBean("member");

        member.work();
    }
}

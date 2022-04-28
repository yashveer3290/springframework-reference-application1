package com.sunglowsys.test;

import com.sunglowsys.domain.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAB {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AB.xml");
        A a = (A) context.getBean("aref");
        System.out.println(a.getId());
        System.out.println(a.getFirstName());
        System.out.println(a.getLastName());
        System.out.println(a.getObj().getAddressLine1());
        System.out.println(a.getObj().getAddressLine1());
    }
}

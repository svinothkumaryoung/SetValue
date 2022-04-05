package com.cognizant.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Setxml.xml");
        StudentRegisteration sr=(StudentRegisteration) context.getBean("sregi");
        sr.printdata();
    }
}

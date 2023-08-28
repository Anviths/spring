package com.ty.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.Person;

public class TestBean {
	public static void main(String[] args) {
       
	ApplicationContext ap=	new ClassPathXmlApplicationContext("my_conf.xml");
	Person p=(Person) ap.getBean("my_person");
	p.message();
	}
}

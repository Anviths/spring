package com.ty.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.Person;

public class TestAppCont {

	public static void main(String[] args) {

		ConfigurableApplicationContext appcont = new ClassPathXmlApplicationContext("my_conf.xml");
		Person p=(Person) appcont.getBean("my_person");
		p.message();
	}

}

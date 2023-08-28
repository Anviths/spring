package com.ty.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.model.Person;

public class Test {

	public static void main(String[] args) {

	ConfigurableApplicationContext conApp=	new ClassPathXmlApplicationContext("xml_config.xml");
	Person p=(Person) conApp.getBean("myperson");
	p.use();
	}

}

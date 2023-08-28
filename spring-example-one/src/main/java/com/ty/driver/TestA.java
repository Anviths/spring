package com.ty.driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ty.Person;

public class TestA {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("my_conf.xml");
		BeanFactory bf= new XmlBeanFactory(resource);
		Person per=(Person)bf.getBean("my_person");
		per.message();
	}

}

package com.ty.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.model.Student;

public class Test {
    public static void main(String[] args) {
		ConfigurableApplicationContext appConf=new ClassPathXmlApplicationContext("xml_config.xml");
	Student s	=(Student)appConf.getBean("myStudent");
	System.out.println("Name is  " +s.getName());
	System.out.println("Age is " +s.getAge());
	System.out.println("Height is " +s.getHeight());
	}
}

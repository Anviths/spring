package com.ty.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.object.Student;
import com.ty.object.Teacher;

public class Test2 {

	public static void main(String[] args) {

		ConfigurableApplicationContext appCont= new ClassPathXmlApplicationContext("xml_config2.xml");
		
		Teacher t=(Teacher) appCont.getBean("myteacher");
		t.teach();
		
	}

}

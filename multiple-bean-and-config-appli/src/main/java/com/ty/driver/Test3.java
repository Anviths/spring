package com.ty.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.object.Student;
import com.ty.object.Teacher;

public class Test3 {
	public static void main(String[] args) {
		ConfigurableApplicationContext appCont = new ClassPathXmlApplicationContext("xml_config1.xml");
		Student s = (Student) appCont.getBean("myStudent");
		s.run();
		Teacher t=(Teacher) appCont.getBean("myteacher");
		t.teach();
		
		
		ConfigurableApplicationContext appCont1 = new ClassPathXmlApplicationContext("xml_config2.xml");
//		Student s1 = (Student) appCont1.getBean("mystudent");
//		s1.run();
		Teacher t1=(Teacher) appCont1.getBean("mystudent");
		t1.teach();
	}
}

package com.ty.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.Student;

public class StudentTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = new ClassPathXmlApplicationContext(
				"xml_config.xml");
		Student std = (Student) con.getBean("my_student");
		std.run();
	}

}

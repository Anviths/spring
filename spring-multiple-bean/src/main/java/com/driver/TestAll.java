package com.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.Staff;
import com.ty.Student;
import com.ty.Teacher;

public class TestAll {

	public static void main(String[] args) {

		ConfigurableApplicationContext appc = new ClassPathXmlApplicationContext("xml_config.xml");
		Student s = (Student) appc.getBean("myStudent");
          s.run();
		Teacher t = (Teacher) appc.getBean("myTeacher");
		t.teach();
		Teacher t1 = (Teacher) appc.getBean("myTeacher ");
		t1.teach();
		Staff staff = (Staff) appc.getBean("myStaff");
		staff.work();
	}

}

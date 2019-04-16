package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Student_Info student=new Student_Info();
		
		student.setName("Praveen");
		student.setRollno(1001);
		 
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}

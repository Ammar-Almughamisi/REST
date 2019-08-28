package com.jdbc;

import com.config.HibernateConf;
import com.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestHb {
    @Autowired
    private static SessionFactory sessionFactory;
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HibernateConf.class);
        Session session = sessionFactory.getCurrentSession();
        Student student = new Student();
        student.setId(2);
        student.setFirst_name("ammar");
        student.setLast_name("hassan");
        student.setEmail("ammar.al");
        student.setPhone_number(59);
        student.setPassword(1234);
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        System.out.println("done");


    }
}

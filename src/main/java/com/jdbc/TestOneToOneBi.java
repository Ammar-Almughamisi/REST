package com.jdbc;

import com.entity.User;
import com.entity.label;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToOneBi {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(label.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            User user = session.get(User.class, 2);
            System.out.println(user);


            System.out.println(user.getLab().getName());
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

}


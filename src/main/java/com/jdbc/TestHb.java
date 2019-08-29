package com.jdbc;

import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHb {

    public static void main(String[] args) {
       SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try{
            User user = new User(3, "test1" , "testlast1" , "tes1t@gmail" , 591 , 1243);
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();

        }
        finally {
            sessionFactory.close();
        }


    }
}

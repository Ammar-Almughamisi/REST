package com.jdbc;

import com.entity.User;
import com.entity.label;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteOneToOne {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(label.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            label labell = session.get(label.class,1);
            session.delete(labell);


            session.getTransaction().commit();
        } finally {
        }
    }
    }


package com.jdbc;

import com.entity.User;
import com.entity.label;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).addAnnotatedClass(label.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            label lab = new label(3, "oneto3ne", 3);
            User user = new User(4, "onetoonefirs43t", "one3oon4elast", "on3e@4one", 57349, 1233445);
            lab.setUser_id(user);

            session.beginTransaction();
            session.save(lab);
            session.getTransaction().commit();
        } finally {
        }
    }
}

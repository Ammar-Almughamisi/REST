package com.jdbc;

import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudent {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try{
            int id =1;
            session.beginTransaction();
            List<User> userList = session.createQuery("from Student").list();
            displayTheStudents(userList);
            userList = session.createQuery("from Student where last_name = 'testlast'").list();

            displayTheStudents(userList);

            User user = session.get(User.class,id);
            user.setLast_name("updated");
            session.createQuery("update Student set email = 'updatealltest'").executeUpdate();
            //session.delete(user);

            session.getTransaction().commit();


        }
        finally {
            sessionFactory.close();
        }
    }

    private static void displayTheStudents(List<User> userList) {
        for(User user : userList){
            System.out.println(user);
        }
    }
}

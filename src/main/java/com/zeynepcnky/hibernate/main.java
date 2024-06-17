package com.zeynepcnky.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.util.List;

public class main  {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(sql_store.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();


try {
   session.beginTransaction();
    List<sql_store> stores = session.createQuery("from sql_store").getResultList();
    for (sql_store store : stores) {
        System.out.println(store.getFirst_name());
        System.out.println(store.getLast_name());
        System.out.println(store.getBirth_date());
    }

   session.getTransaction().commit();

}finally {
    session.close();
}

    }
}

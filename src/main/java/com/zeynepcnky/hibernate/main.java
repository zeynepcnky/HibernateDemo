package com.zeynepcnky.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
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
   //HQL = HİBERNATE QUERY LANGUAGE
    // Like OPERATOR USE WİTH %
    //Order by ASC, DESC
//    List<sql_store> stores = session.createQuery("from sql_store e order by e.first_name desc ").getResultList();
//    for (sql_store store : stores) {
//        System.out.println(store.getFirst_name());
//        System.out.println(store.getLast_name());
//        System.out.println(store.getBirth_date());
//    //İNSERT
//    sql_store store = new sql_store();
//    store.setCustomer_id("11");
//    store.setFirst_name("Zeynep");
//    store.setLast_name("Çankaya");
//    store.setBirth_date("2001-04-28");
//    store.setCity("Yalova");
//    session.save(store);

    //UPDATE
//       sql_store store =  session.get(sql_store.class,3);
//       store.setCity("Yalova");
//
//       session.save(store);
//
//       session.getTransaction().commit();
//         System.out.println("City updated");

         //DELETE
//         sql_store store = session.get(sql_store.class, 3);
//         session.delete(store);


}finally {
    session.close();
}

    }
}

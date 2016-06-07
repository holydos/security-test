package com.vutichenko.sectest.dao;


import com.vutichenko.sectest.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by vutichenko on 30.05.2016.
 */
public class UserDaoImpl implements UserDao {

    @Autowired
    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void updateUser(User user) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(user);
        tx.commit();
        session.close();
    }

    @Override
    public User getUserByLogin(String login) {
        Session session = this.sessionFactory.openSession();
        Query query = session.createQuery("from User where login <=:inc_login");
        query.setString("inc_login", login);
        User result =  (User)query.uniqueResult();
        session.close();
        return result;
    }
}

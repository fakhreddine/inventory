package com.springapp.mvc.dao;

import com.springapp.mvc.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by aleksandrs on 1/6/14.
 */
@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private EntityManagerFactory emf;

    @Override
    public User getUser(String login) {
        EntityManager em = emf.createEntityManager();
        User user = (User) em.createQuery("SELECT u FROM User u WHERE u.userName=:login")
                .setParameter("login", login)
                .getSingleResult();
            return user;
    }
}

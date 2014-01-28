package com.springapp.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by aleksandrs on 1/28/14.
 */
@Service
public class PasswordReminder {

    private String password = null;
    private String mail = null;

    @Autowired
    private EntityManagerFactory emf;

    public void sendPassword(String login){
        EntityManager em = emf.createEntityManager();
        password = (String) em.createQuery("SELECT u.password FROM User u WHERE u.userName=:username")
                .setParameter("username",login)
                .getSingleResult();
        mail = (String) em.createQuery("SELECT u.email FROM User u WHERE u.userName=:username")
                .setParameter("username",login)
                .getSingleResult();
        if (password != null && mail != null) Mailer.send("password", password, mail);
    }

}

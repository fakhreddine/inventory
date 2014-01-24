package com.springapp.mvc.dao;

import com.springapp.mvc.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by aleksandrs on 1/6/14.
 */
@Repository
public class RoleDAOImpl implements RoleDAO {

    @Autowired
    private EntityManagerFactory emf;

    @Override
    public Role getRole(int id) {
        EntityManager em = emf.createEntityManager();
        Role role = (Role) em.createQuery("select r from Role r where r.id=:id")
                .setParameter("id",id)
                .getSingleResult();
        return role;
    }
}

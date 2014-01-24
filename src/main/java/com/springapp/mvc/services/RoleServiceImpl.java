package com.springapp.mvc.services;

import com.springapp.mvc.dao.RoleDAO;
import com.springapp.mvc.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aleksandrs on 1/7/14.
 */
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleDAO roleDAO;

    @Override
    public Role getRole(int id) {
        return roleDAO.getRole(id);
    }
}

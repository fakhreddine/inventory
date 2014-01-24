package com.springapp.mvc.services;

import com.springapp.mvc.dao.UserDAO;
import com.springapp.mvc.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aleksandrs on 1/7/14.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User getUser(String login) {
        return userDAO.getUser(login);
    }
}

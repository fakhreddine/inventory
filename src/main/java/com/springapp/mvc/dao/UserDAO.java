package com.springapp.mvc.dao;

import com.springapp.mvc.entities.User;

/**
 * Created by aleksandrs on 1/6/14.
 */
public interface UserDAO {

    public User getUser(String login);

}

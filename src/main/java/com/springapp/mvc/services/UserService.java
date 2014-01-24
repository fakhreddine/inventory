package com.springapp.mvc.services;

import com.springapp.mvc.entities.User;

/**
 * Created by aleksandrs on 1/7/14.
 */
public interface UserService {
    public User getUser(String login);
}

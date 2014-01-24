package com.springapp.mvc.dao;

import com.springapp.mvc.entities.VLAN;

import java.util.List;

/**
 * Created by aleksandrs on 1/3/14.
 */
public interface VLANDAO {
    public List<VLAN> findAll(String value);

    public long getNextId();

}

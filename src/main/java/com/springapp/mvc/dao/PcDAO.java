package com.springapp.mvc.dao;

import com.springapp.mvc.entities.Pc;

import java.util.List;

/**
 * Created by aleksandrs on 1/2/14.
 */
public interface PcDAO {
    public List<Pc> searchByName(String name);

    public List<Pc> searchByHdd(String hdd);

    public List<Pc> searchByOs(String os);

    public List<Pc> searchByUser(String user);

    public List<Pc> searchByCPU(String cpu);

    public List<Pc> findAll(String value);

    public List<Pc> findAll();

    public Pc findOne(long id);

    public void save(Pc pc);
}

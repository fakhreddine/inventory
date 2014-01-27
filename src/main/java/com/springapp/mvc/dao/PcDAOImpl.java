package com.springapp.mvc.dao;

import com.springapp.mvc.entities.ComputerRepository;
import com.springapp.mvc.entities.OpSystem;
import com.springapp.mvc.entities.Pc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by aleksandrs on 1/2/14.
 */
@Repository
public class PcDAOImpl implements PcDAO {

    private EntityManagerFactory emf;

    private EntityManager getEM(){
        return emf.createEntityManager();
    }

    public PcDAOImpl() {
    }

    public PcDAOImpl(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void save(Pc pc){
        getEM().persist(pc);
    }

    @Override
    public List<Pc> searchByName(String name) {
        Query q = getEM().createQuery("SELECT p FROM Pc p");
        List<Pc> pcList = q.getResultList();
        List<Pc> returnableList = new LinkedList<Pc>();
        for(Pc pc : pcList){
            if (pc.getNumber().equalsIgnoreCase(name)) returnableList.add(pc);
        }
        return returnableList;
    }

    @Override
    public List<Pc> searchByHdd(String hdd) {
        Query q = getEM().createQuery("SELECT p FROM Pc p");
        List<Pc> pcList = q.getResultList();
        List<Pc> returnableList = new LinkedList<Pc>();
        for(Pc pc : pcList){
            if (pc.getHdd().equalsIgnoreCase(hdd)) returnableList.add(pc);
        }
        return returnableList;
    }

    @Override
    public List<Pc> searchByOs(String os) {
        Query q = getEM().createQuery("SELECT p FROM Pc p");
        List<Pc> pcList = q.getResultList();
        List<Pc> returnableList = new LinkedList<Pc>();
        for(Pc pc : pcList){
            if (pc.getOs() == OpSystem.valueOf(os)) returnableList.add(pc);
        }
        return returnableList;
    }

    @Override
    public List<Pc> searchByUser(String user) {
        return null;
    }

    @Override
    public List<Pc> searchByCPU(String cpu) {
        return null;
    }

    @Override
    public List<Pc> findAll(String value) {
        Query q = getEM().createQuery("SELECT p FROM Pc p");
        List<Pc> pcList = q.getResultList();
        List<Pc> returnableList = new LinkedList<Pc>();
        Pattern pattern = Pattern.compile(".*"+value+".*", Pattern.CASE_INSENSITIVE);
        for(Pc pc : pcList){
            if (
                            pc.getNumber().equalsIgnoreCase(value) || pc.getNumber().matches(".*(?iu)"+value+".*") ||
                            pc.getHdd().equalsIgnoreCase(value) || pc.getHdd().matches(".*(?iu)"+value+".*") ||
                            pc.getCpu().equalsIgnoreCase(value) || pc.getCpu().matches(".*(?iu)"+value+".*") ||
                            pc.getUser().equalsIgnoreCase(value) || pc.getUser().matches(".*(?iu)"+value+".*") ||
                            pc.getOffice().equalsIgnoreCase(value) || pc.getOffice().matches(".*(?iu)"+value+".*")
               )
            {
                returnableList.add(pc);
            }
        }
        return returnableList;

    }

    public List<Pc> findAll(){
        return getEM().createQuery("SELECT p FROM Pc p").getResultList();
    }

    public Pc findOne(long id) {
        return getEM().find(Pc.class, id);
    }
}

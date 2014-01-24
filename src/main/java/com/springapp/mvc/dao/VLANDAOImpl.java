package com.springapp.mvc.dao;

import com.springapp.mvc.entities.VLAN;
import com.springapp.mvc.entities.VLANRepository;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by aleksandrs on 1/3/14.
 */
public class VLANDAOImpl implements VLANDAO {

    private VLANRepository repository;

    public VLANDAOImpl(VLANRepository repository) {
        this.repository = repository;
    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    @Override
    public List<VLAN> findAll(String value) {
        List<VLAN> vlans = repository.findAll();
        List<VLAN> returnableList = new LinkedList<VLAN>();
        for (VLAN vlan : vlans){
            if (
                            vlan.getA_address().equalsIgnoreCase(value) || vlan.getA_address().matches(".*(?iu)"+value+".*") ||
                            vlan.getB_address().equalsIgnoreCase(value) || vlan.getB_address().matches(".*(?iu)"+value+".*") ||
                            vlan.getA_device().equalsIgnoreCase(value) || vlan.getA_device().matches(".*(?iu)"+value+".*") ||
                            vlan.getB_device().equalsIgnoreCase(value) || vlan.getB_device().matches(".*(?iu)"+value+".*") ||
                            vlan.getDescr().matches(".*(?iu)"+value+".*")
               ){
                returnableList.add(vlan);
            }
            if (isInteger(value)){
                Long vlanID = vlan.getVlan();
                Long searchID = Long.parseLong(value);
                if (vlanID.equals(searchID)) returnableList.add(vlan);
            }
        }
        return returnableList;
    }

    @Override
    public long getNextId() {
        long currentMax = 0;
        List<VLAN> vlans = repository.findAll();
        for (VLAN vlan : vlans){
            if (vlan.getVlan()>currentMax) currentMax = vlan.getVlan();
        }
        return (currentMax+1);
    }
}

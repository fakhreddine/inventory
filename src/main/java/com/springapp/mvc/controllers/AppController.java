package com.springapp.mvc.controllers;

import com.springapp.mvc.dao.PcDAO;
import com.springapp.mvc.dao.PcDAOImpl;
import com.springapp.mvc.dao.VLANDAOImpl;
import com.springapp.mvc.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManagerFactory;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by aleksandrs on 12/27/13.
 */
@Controller
@RequestMapping("/app")
public class AppController {
    @Autowired
    private EntityManagerFactory emf;

    @Autowired
    private ComputerRepository repository;

    @Autowired
    private VLANRepository vlanRepository;

    private PcDAOImpl pcDAO = new PcDAOImpl(emf);
    private VLANDAOImpl vlanDAO;
    private static String searchCriteria = "";

    public static String getSearchCriteria() {
        return searchCriteria;
    }

    @RequestMapping("/")
    public ModelAndView getIndex(){
        ModelAndView model = new ModelAndView("index");
        model.addObject("act","");
        return model;
    }
/*
PCs
 */
    @RequestMapping(value = "/pc/list", method = RequestMethod.GET)
    public ModelAndView getPCList(){
        ModelAndView model = new ModelAndView("index");
        model.addObject("act","devices");
        model.addObject("include","pc_list");
        if (searchCriteria.equals("")){
            //pcDAO = new PcDAOImpl();
            model.addObject("list",pcDAO.findAll());
        } else {
            //pcDAO = new PcDAOImpl(repository);
            model.addObject("list", pcDAO.findAll(searchCriteria));
        }
        return model;
    }

    @RequestMapping(value = "/pc/list", method = RequestMethod.POST)
    public ModelAndView searchPC(@RequestParam("search") String search){
        searchCriteria = search;
        return new ModelAndView("redirect:/app/pc/list");
    }

    @RequestMapping(value = "/pc/list/all", method = RequestMethod.GET)
    public ModelAndView resetSearchPC(){
        searchCriteria = "";
        return new ModelAndView("redirect:/app/pc/list");
    }

    @RequestMapping(value = "/pc/add", method = RequestMethod.GET)
    @ModelAttribute("pc")
    public ModelAndView addPc(Pc pc){
        ModelAndView model = new ModelAndView("index");
        model.addObject("include","pc_add");
        model.addObject("act","devices");
        model.addObject("osTypes", OpSystem.values());
        return model;
    }

    @RequestMapping(value = "/pc/add", method = RequestMethod.POST)
    public ModelAndView savePc(@ModelAttribute("pc") Pc pc, BindingResult result){
        if (pc.getId()==null){
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, 1);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            pc.setAddDate(format.format(cal.getTime()));
        }
        //pcDAO = new PcDAOImpl();
        pcDAO.save(pc);
        return new ModelAndView("redirect:/app/pc/list");
    }

    @RequestMapping(value = "/pc/edit/{id}", method = RequestMethod.GET)
    @ModelAttribute("pc")
    public ModelAndView editPc(@PathVariable("id") long id, Pc pc){
        //pcDAO = new PcDAOImpl();
        pc = pcDAO.findOne(id);
        ModelAndView model = new ModelAndView("index");
        model.addObject("include","pc_add");
        model.addObject("act","devices");
        model.addObject("osTypes", OpSystem.values());
        model.addObject("pc",pc);
        return model;
    }
/*
VLANs
 */
    @RequestMapping(value = "/vlan/list", method = RequestMethod.GET)
    public ModelAndView getVLANList(){
        ModelAndView model = new ModelAndView("index");
        model.addObject("act","vlans");
        model.addObject("include","vlan_list");
        if (searchCriteria.equals("")){
            model.addObject("list",vlanRepository.findAll());
        } else {
            vlanDAO = new VLANDAOImpl(vlanRepository);
            model.addObject("list", vlanDAO.findAll(searchCriteria));
        }
        return model;
    }

    @RequestMapping(value = "/vlan/add", method = RequestMethod.GET)
    public ModelAndView addVLAN(@ModelAttribute("vlan") VLAN vlan){
        vlanDAO = new VLANDAOImpl(vlanRepository);
        ModelAndView model = new ModelAndView("index");
        model.addObject("include","vlan_add");
        model.addObject("act","vlans");
        model.addObject("maxID",vlanDAO.getNextId());
        return model;
    }

    @RequestMapping(value = "/vlan/add", method = RequestMethod.POST)
    public ModelAndView saveVLAN(@ModelAttribute("vlan") VLAN vlan, BindingResult result){
        if (vlan.getId()==null){
            vlan.setActive(true);
        }
        vlanRepository.save(vlan);
        return new ModelAndView("redirect:/app/vlan/list");
    }

    @RequestMapping(value = "/vlan/list/all", method = RequestMethod.GET)
    public ModelAndView resetSearchVLAN(){
        searchCriteria = "";
        return new ModelAndView("redirect:/app/vlan/list");
    }

    @RequestMapping(value = "/vlan/list", method = RequestMethod.POST)
    public ModelAndView searchVLAN(@RequestParam("search") String search){
        searchCriteria = search;
        return new ModelAndView("redirect:/app/vlan/list");
    }

    @RequestMapping(value = "/vlan/edit/{id}", method = RequestMethod.GET)
    @ModelAttribute("vlan")
    public ModelAndView editPc(@PathVariable("id") long id, VLAN vlan){
        vlan = vlanRepository.findOne(id);
        ModelAndView model = new ModelAndView("index");
        model.addObject("include","vlan_add");
        model.addObject("act","vlans");
        model.addObject("vlan",vlan);
        return model;
    }

}

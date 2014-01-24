package com.springapp.mvc.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by aleksandrs on 1/6/14.
 */
@RequestMapping("/company")
public class CompanyController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView getCompanyList(){
        ModelAndView model = new ModelAndView("index");
        return model;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addCompany(){
        return new ModelAndView();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView saveCompany(){
        return new ModelAndView("redirect:/company/list");
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editCompany(@PathVariable("id") long id){
        return new ModelAndView();
    }
}

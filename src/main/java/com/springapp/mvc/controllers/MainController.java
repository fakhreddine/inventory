package com.springapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by aleksandrs on 12/27/13.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public ModelAndView getAuthenticatedLocation(){
        return new ModelAndView("redirect:/app/");
    }
}

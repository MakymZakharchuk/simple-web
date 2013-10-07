package ua.bychkovskyy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.bychkovskyy.model.Language;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PagesController {
    @RequestMapping(value = "/home")
    public ModelAndView home(){
        return new ModelAndView("home");
    }


    @RequestMapping(value = "/about")
    public ModelAndView about(){
        return new ModelAndView("about");
    }


    @RequestMapping(value = "/rating")
    public ModelAndView rating(){
        return new ModelAndView("rating");
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("language", Language.DEFAULT.getValue());
        return new ModelAndView("login", modelMap);
    }


    @RequestMapping(value = "/register")
    public ModelAndView register(){
        return new ModelAndView("register");
    }

}

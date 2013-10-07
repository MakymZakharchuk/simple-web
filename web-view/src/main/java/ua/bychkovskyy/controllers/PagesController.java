package ua.bychkovskyy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

//    @RequestMapping(value = "/login")
//    public ModelAndView login(){
//        return new ModelAndView("/login.jsp");
//    }


    @RequestMapping(value = "/register")
    public ModelAndView register(){
        return new ModelAndView("register");
    }

}

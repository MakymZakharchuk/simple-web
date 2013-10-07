package ua.bychkovskyy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.bychkovskyy.beans.LoginBean;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HeaderController {

    @Autowired
    private LoginBean loginBean;

    @RequestMapping(value = "jsp/welcome-bar.jsp")
    public ModelAndView getHeader() {

        Map<String, Object> modelMap = new HashMap<String, Object>();
        if (loginBean.isAuthorized()) {
            modelMap.put("url1", "/pages/profile.jsp");
            modelMap.put("url2", "/configuration.jsp");
            modelMap.put("url3", "/j_spring_security_logout");
            modelMap.put("label1", "Hello user name");
            modelMap.put("label2", "Налаштування аккаунту");
            modelMap.put("label3", "Вихід");
        }else {
            modelMap.put("url1", "/");
            modelMap.put("url2", "/app/register");
            modelMap.put("url3", "/app/login");
            modelMap.put("label1", "Домашня");
            modelMap.put("label2", "Реєстрація");
            modelMap.put("label3", "Вхід");
        }
        ModelAndView result = new ModelAndView("template/welcome-bar", modelMap);
        return result;
    }
}

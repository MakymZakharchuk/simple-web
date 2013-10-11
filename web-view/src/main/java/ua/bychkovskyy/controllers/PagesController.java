package ua.bychkovskyy.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.bychkovskyy.model.Language;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.service.GameService;
import ua.bychkovskyy.service.PlayerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PagesController {

    private final Log LOG = LogFactory.getLog(PagesController.class);

    @Autowired
    private PlayerService playerService;

    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/home")
    public ModelAndView home(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("games", gameService.getActiveGames());
        return new ModelAndView("home", modelMap);
    }


    @RequestMapping(value = "/about")
    public ModelAndView about(){
        return new ModelAndView("about");
    }


    @RequestMapping(value = "/rating")
    public ModelAndView rating(){
        Map<String, List<Player>> modelMap = new HashMap<String, List<Player>>();

        modelMap.put("players", playerService.getAllPlayers());

        return new ModelAndView("rating", modelMap);
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

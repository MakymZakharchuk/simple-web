package ua.bychkovskyy.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.bychkovskyy.model.Game;
import ua.bychkovskyy.service.GameService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GameObserverController {
    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/watch/get")
    public @ResponseBody Game getGame(@RequestParam("id") int id){
        return gameService.getGame(id);
    }

    @RequestMapping(value = "/watch")
    public ModelAndView watch(@RequestParam("id") int id, HttpServletRequest request) {
        //todo make async context
        return new ModelAndView("watch");
    }
}

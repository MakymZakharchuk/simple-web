package ua.bychkovskyy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.service.PlayerService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping(value = "/*")
public class RegisterController {

    @Autowired
    private UserService userService;

    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "/actionRegister", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView registerNewUser(
            @RequestParam("firstname")String fisrtname,
            @RequestParam("lastname")String lastname,
            @RequestParam("username")String username,
            @RequestParam("password1")String password1,
            @RequestParam("password2")String password2,
            @RequestParam("lang")String lang){
        if (userService.userExists(username)){
            Map<String, Object> modelMap = new HashMap<String, Object>();
            modelMap.put("validationMessageUserName", "Already in use");
            return new ModelAndView("register",modelMap);
        }

        User user = new User(username,password1, Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));

        Player player = new Player();
        player.setUserName(username);
        player.setFirstName(fisrtname);
        player.setLastName(lastname);

        userService.createUser(user);
        playerService.saveNewPlayer(player);
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/actionRegister", method = RequestMethod.GET)
    private ModelAndView redirectToPage(){
        return new ModelAndView("register");
    }
}

package ua.bychkovskyy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;


@Controller
@RequestMapping(value = "/*")
public class RegisterController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String registerNewUser(
            @RequestParam("firstname")String fisrtname,
            @RequestParam("lastname")String lastname,
            @RequestParam("username")String username,
            @RequestParam("password1")String password1,
            @RequestParam("password2")String password2,
            @RequestParam("lang")String lang){
        User user = new User(username,password1, Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
        userService.createUser(user);
        return "";
    }
}

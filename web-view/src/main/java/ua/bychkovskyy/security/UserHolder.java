package ua.bychkovskyy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.service.PlayerService;

@Service
public class UserHolder {
    @Autowired
    private static PlayerService playerService;

    public static Player getUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }
        return playerService.getPlayer(username);
    }
}

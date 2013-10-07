package ua.bychkovskyy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.service.PlayerService;

public class UserHolder {
    @Autowired
    private PlayerService playerService;

    public Player getUser() {
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

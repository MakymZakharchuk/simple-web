package ua.bychkovskyy.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import ua.bychkovskyy.service.PlayerService;

public class UserHolder {
    private PlayerService playerService;

    private static volatile UserHolder instance;

    private UserHolder() {
    }

    public static UserHolder getInstance() {
        if (instance == null) {
            synchronized (UserHolder.class) {
                if (instance == null) {
                    instance = new UserHolder();
                }
            }
        }
        return instance;
    }

    public static String getUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }
        return username;
    }

    public void setPlayerService(PlayerService playerService) {
        this.playerService = playerService;
    }
}

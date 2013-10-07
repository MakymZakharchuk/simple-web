package ua.bychkovskyy.beans;

import ua.bychkovskyy.model.Language;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.security.UserHolder;

public class LoginBean {
    private UserHolder userHolder = UserHolder.getInstance();

    public String getLanguage() {
        return userHolder.getUser() != null
                ? userHolder.getUser().getLanguage()
                : Language.DEFAULT.getValue();
    }

    public String getDisplayUserName() {
        String displayName;
        Player user = userHolder.getUser();
        if (user.getFistName() != null && user.getLastName() != null) {
            displayName = user.getFistName() + " " + user.getLastName();
        } else {
            displayName = user.getUserName();
        }

        return displayName;
    }

    public boolean isAuthorized() {
        return userHolder.getUser() != null;
    }
}

package ua.bychkovskyy.beans;

import ua.bychkovskyy.model.Language;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.security.UserHolder;

public class LoginBean {

    public String getLanguage() {
        return UserHolder.getUser() != null
                ? UserHolder.getUser().getLanguage()
                : Language.DEFAULT.getValue();
    }

    public String getDisplayUserName() {
        String displayName;
        Player user = UserHolder.getUser();
        if (user.getFistName() != null && user.getLastName() != null) {
            displayName = user.getFistName() + " " + user.getLastName();
        } else {
            displayName = user.getUserName();
        }

        return displayName;
    }

    public boolean isAuthorized() {
        return UserHolder.getUser() != null;
    }
}

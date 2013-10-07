package ua.bychkovskyy.beans;

import ua.bychkovskyy.model.Language;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.security.UserHolder;

public class LoginBean {
    private UserHolder userHolder = UserHolder.getInstance();

    public String getLanguage() {
        return Language.UK.getValue();
    }

    public String getDisplayUserName() {
        String displayName = null ;
//        Player user = userHolder.getUser();
//        if (user.getFistName() != null && user.getLastName() != null) {
//            displayName = user.getFistName() + " " + user.getLastName();
//        } else {
//            displayName = user.getUserName();
//        }

        return displayName;
    }

    public boolean isAuthorized() {
        return !userHolder.getUser().equals("anonymousUser");
    }
}

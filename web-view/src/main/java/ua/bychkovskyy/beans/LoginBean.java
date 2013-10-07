package ua.bychkovskyy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import ua.bychkovskyy.model.Language;
import ua.bychkovskyy.model.Player;
import ua.bychkovskyy.security.UserHolder;
import ua.bychkovskyy.utils.StringUtils;

import static ua.bychkovskyy.utils.StringUtils.*;

public class LoginBean {
    @Autowired
    private UserHolder userHolder;

    public String getLanguage() {
        return Language.UK.getValue();
    }

    public String getDisplayUserName() {
        String displayName = null ;
        Player user = userHolder.getUser();
        if (isNotEmptyString(user.getFistName()) && isNotEmptyString(user.getLastName())) {
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

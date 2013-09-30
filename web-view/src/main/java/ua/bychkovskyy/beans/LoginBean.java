package ua.bychkovskyy.beans;

import ua.bychkovskyy.model.Configuration;
import ua.bychkovskyy.model.Language;

public class LoginBean {
    private Configuration configuration = new Configuration();

    public LoginBean() {
        this.configuration.setLanguage(Language.UK);
    }

    public String getLanguage(){
        return configuration.getLanguage().getValue();
    }
}

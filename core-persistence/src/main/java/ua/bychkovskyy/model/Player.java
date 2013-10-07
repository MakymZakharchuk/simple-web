package ua.bychkovskyy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYERS")
public class Player {
    @Id
    @Column(name = "NICK_NAME")
    private String userName;

    @Column(name = "FIRST_NAME")
    private String fistName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "LANG")
    private String language;

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
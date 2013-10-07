package ua.bychkovskyy.model;


public enum Language {
    UK("uk"),
    EN("en"),
    DEFAULT("uk");
    private String value;

    Language(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

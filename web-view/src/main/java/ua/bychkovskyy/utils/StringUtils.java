package ua.bychkovskyy.utils;

public class StringUtils {
    public static boolean isEmptyString(String s){
        return s == null || "".equals(s);
    }

    public static boolean isNotEmptyString(String s){
        return !isEmptyString(s);
    }
}

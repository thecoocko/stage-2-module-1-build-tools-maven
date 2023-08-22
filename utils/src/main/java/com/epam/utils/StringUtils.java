package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            if (str.startsWith("0") && str.charAt(1)!='.'){
                return false;
            }
            return Double.valueOf(str) > 0 ? true : false;
        }
        catch (Exception e){
            return false;
        }
    }
}

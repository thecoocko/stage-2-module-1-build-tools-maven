package com.epam.demo;

import java.util.LinkedList;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        List<Boolean> results = new LinkedList<>();
        for(String i : args){
            results.add(i.startsWith("-"));
        }
        return results.contains(true);
    }
}
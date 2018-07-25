package com.fangfaze.java.study.chapter7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    static private final List<String> strings = new LinkedList<>();

    static public String[] getStrings() {
        return strings.toArray(new String[strings.size()]);
    }


}

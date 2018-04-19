package com.fangfaze.java.study.chapter4;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    private StringComparator() {
    }

    public static final StringComparator COMPARATOR = new StringComparator();

}

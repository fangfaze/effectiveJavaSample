package com.fangfaze.java.study.chapter7;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {

    public static String classify(Set<?> set) {
        return "Set";
    }

    public static String classify(List<?> list) {
        return "List";
    }

    public static String classify(Collection<?> collection) {
        return "Collection";
    }

    protected static void hello() {
    }

}

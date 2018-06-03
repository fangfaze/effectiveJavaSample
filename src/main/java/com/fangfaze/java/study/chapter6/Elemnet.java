package com.fangfaze.java.study.chapter6;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public enum Elemnet {
    木, 目, 水;

    public enum Composite {
        林(木, 木),
        相(木, 目),
        沐(水, 木),
        泪(水, 目);

        private Elemnet left;
        private Elemnet right;

        Composite(Elemnet left, Elemnet right) {
            this.left = left;
            this.right = right;
        }
    }

    private static Map<Elemnet, Map<Elemnet, Composite>> map = new EnumMap<>(Elemnet.class);

    static {
        for (Elemnet elemnet : Elemnet.values()) {
            map.put(elemnet, new EnumMap<>(Elemnet.class));
        }
        for (Composite composite : Composite.values()) {
            map.get(composite.left).put(composite.right, composite);
        }
    }

    public static Composite mix(Elemnet left, Elemnet right) {
        return map.get(left).get(right);
    }

}

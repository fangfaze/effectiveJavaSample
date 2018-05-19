package com.fangfaze.java.study.chapter5;

import java.util.HashMap;
import java.util.Map;

public class Favorites {

    private Map<Class<?>, Object> map = new HashMap<>();

    public <T> void put(Class<T> type, T instance) {
        map.put(type, type.cast(instance));
    }

    public <T> T get(Class<T> type) {
        return type.cast(map.get(type));
    }

}

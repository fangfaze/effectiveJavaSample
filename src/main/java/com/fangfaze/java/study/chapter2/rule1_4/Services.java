package com.fangfaze.java.study.chapter2.rule1_4;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
    private Services() {
    }

    private static final Map<String, Provider> providerMap = new ConcurrentHashMap<>();
    public static final String DEFAULT_PROVIDER = "DEF";


    //注册服务
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER, p);
    }

    public static void registerProvider(String name, Provider p) {
        providerMap.put(name, p);
    }

    //创建服务
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER);
    }

    public static Service newInstance(String name) {
        Provider p = providerMap.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No provider registed with name : " + name);
        }
        return p.newService();
    }

}

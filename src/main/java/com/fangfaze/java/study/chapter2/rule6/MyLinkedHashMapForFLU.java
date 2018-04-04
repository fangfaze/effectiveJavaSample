package com.fangfaze.java.study.chapter2.rule6;

import java.util.LinkedHashMap;
import java.util.Map;



// TODO 使用linkedHashMap实现FLU算法
public class MyLinkedHashMapForFLU<K, V> extends LinkedHashMap<K, V> {

    public MyLinkedHashMapForFLU(){
        super();
    }

    @Override
    public boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return true;
    }
}

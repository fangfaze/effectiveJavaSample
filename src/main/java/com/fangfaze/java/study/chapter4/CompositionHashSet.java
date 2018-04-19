package com.fangfaze.java.study.chapter4;

import java.util.Collection;
import java.util.HashSet;

public class CompositionHashSet<E> {

    private int addCount = 0;
    private final HashSet<E> hashSet;

    public CompositionHashSet() {
        hashSet = new HashSet<>();
    }

    public CompositionHashSet(int initCap, float loadFactor) {
        hashSet = new HashSet<>(initCap, loadFactor);
    }

    public boolean add(E e) {
        addCount++;
        return hashSet.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return hashSet.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

}

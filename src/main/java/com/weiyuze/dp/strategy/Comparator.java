package com.weiyuze.dp.strategy;

@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1,T o2);
}

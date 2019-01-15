package com.yb.singlepatterns;

/**
 * 饿汉模式 线程安全
 *
 * @author yebin
 */
public class Single03Pattern {
    private static Single03Pattern instance = new Single03Pattern();

    private Single03Pattern() {

    }

    public static Single03Pattern getInstance() {
        return instance;
    }
}

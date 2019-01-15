package com.yb.singlepatterns;

/**
 * 线程安全的懒汉模式
 * @author yebin
 */
public class Single02Pattern {
    private static Single02Pattern instance;
    private Single02Pattern(){

    }
    public static synchronized Single02Pattern getInstance(){
        if(instance == null ){
            instance = new Single02Pattern();
        }
        return instance;
    }
}

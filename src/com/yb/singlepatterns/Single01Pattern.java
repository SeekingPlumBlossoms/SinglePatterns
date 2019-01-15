package com.yb.singlepatterns;

/**
 * 懒汉模式 线程不安全
 * @author yebin
 */
public class Single01Pattern {
    private static Single01Pattern instance;
    private Single01Pattern(){

    }
    public static Single01Pattern getInstance(){
        if(instance == null ){
            instance = new Single01Pattern();
        }
        return instance;
    }
}

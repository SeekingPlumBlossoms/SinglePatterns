package com.yb.singlepatterns;

/**
 * 双重校验锁法 (通常线程安全,低概率不安全)
 * @author yebin
 */
public class Single06Pattern {
    private static Single06Pattern instance;
    private Single06Pattern(){
        System.out.println("Single06Pattern has loaded");
    }
    public static Single06Pattern getInstance(){
        if(instance == null){
            synchronized (Single06Pattern.class){
                if(instance == null){
                        instance = new Single06Pattern();
                }
            }
        }
        return instance;
    }
}

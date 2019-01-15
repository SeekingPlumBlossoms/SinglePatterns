package com.yb.singlepatterns;

/**
 * volatile 版本
 * @author yebin
 */
public class Single07Pattern {
    private volatile static Single07Pattern single07Pattern;
    private Single07Pattern(){

    }

    public static Single07Pattern getInstance(){
        if(single07Pattern == null){
            synchronized (Single07Pattern.class){
                if(single07Pattern == null){
                    single07Pattern = new Single07Pattern();
                }
            }
        }
        return single07Pattern;
    }
}

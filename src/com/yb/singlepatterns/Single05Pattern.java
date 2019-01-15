package com.yb.singlepatterns;

/**
 * 枚举方法 线程安全
 * @author yebin
 */

public enum  Single05Pattern {
    //接口
    INSTANCE;
    public void otherMethods(){
        System.out.println("Something");
    }
}

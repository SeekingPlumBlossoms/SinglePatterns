package com.yb.singlepatterns;

/**
 * 静态内部类加载 线程安全
 * @author yebin
 */
public class Single04Pattern {

    private static class Single03PatternHolder{
        private static Single04Pattern instance=new Single04Pattern();
    }

    private Single04Pattern(){

    }
    public static Single04Pattern getInstance(){
        return Single03PatternHolder.instance;
    }
}

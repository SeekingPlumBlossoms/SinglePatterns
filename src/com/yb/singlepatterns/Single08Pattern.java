package com.yb.singlepatterns;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

/**
 * 使用ThreadLocal实现单例模式 线程安全
 * @author yebin
 */
public class Single08Pattern {

    private static final ThreadLocal<SimpleDateFormat> tlSimpleFormatter = ThreadLocal.withInitial(
            ()->new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    private static final ThreadLocal<Single08Pattern> tlSingle08Pattern = new ThreadLocal<Single08Pattern>(){
        @Override
        protected Single08Pattern initialValue(){return new Single08Pattern();}
    };

    public static Single08Pattern getInstance(){
        return tlSingle08Pattern.get();
    }

    private Single08Pattern(){}
}

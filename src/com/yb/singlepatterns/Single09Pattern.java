package com.yb.singlepatterns;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 使用CAS锁实现
 * @author yebin
 */
public class Single09Pattern {
    private static final AtomicReference<Single09Pattern> INSTANCE = new AtomicReference<>();
    private Single09Pattern(){}

    public static  Single09Pattern getInstance(){
        for(;;){
            Single09Pattern current = INSTANCE.get();
            if(current != null){
return current;
            }
            current = new Single09Pattern();
            if(INSTANCE.compareAndSet(null,current)){
                return current;
            }
        }
    }
}

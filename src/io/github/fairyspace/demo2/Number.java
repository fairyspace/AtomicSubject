package io.github.fairyspace.demo2;

import java.util.concurrent.atomic.AtomicInteger;

public class Number {
    AtomicInteger atomicInteger = new AtomicInteger();
    public void  add(){
        atomicInteger.incrementAndGet();
    }
}

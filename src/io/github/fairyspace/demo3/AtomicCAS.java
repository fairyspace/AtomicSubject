package io.github.fairyspace.demo3;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCAS {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(1);

        System.err.println(atomicInteger.compareAndSet(1,2)+",data:"+atomicInteger.get());
        System.err.println(atomicInteger.compareAndSet(1,2)+",data:"+atomicInteger.get());
    }
}

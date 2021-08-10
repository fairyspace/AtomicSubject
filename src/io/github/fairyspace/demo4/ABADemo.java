package io.github.fairyspace.demo4;

import java.util.concurrent.atomic.AtomicStampedReference;

public class ABADemo {
    public static void main(String[] args) {
        /*初始化版本号为100，值为1*/
        AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(100, 1);
        boolean b = atomicStampedReference.compareAndSet(100, 101, 1, 2);
        boolean c = atomicStampedReference.compareAndSet(100, 101, 2, 3);
        boolean d = atomicStampedReference.compareAndSet(101, 102, 1, 3);
        boolean f = atomicStampedReference.compareAndSet(101, 102, 2, 3);
        System.err.println(b);
        System.err.println(c);
        System.err.println(d);
        System.err.println(f);
    }
}

package io.github.fairyspace.demo4;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class ABADemo2 {
    public static void main(String[] args) {
        /*初始化版本号为100，值为1*/
        AtomicReference<User> atomicStampedReference = new AtomicReference<>();
        User user1 = new User();user1.setAge(20);user1.setName("张三");
        User user2 = new User();user2.setAge(30);user2.setName("李四");
        atomicStampedReference.set(user1);
        System.err.println(atomicStampedReference.compareAndSet(user1, user2)+"\t"+atomicStampedReference.get().getName());
        System.err.println(atomicStampedReference.compareAndSet(user1, user2)+"\t"+atomicStampedReference.get().getName());

    }
}

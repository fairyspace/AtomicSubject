package io.github.fairyspace.demo1;

/**
 * @author xuquanru
 */
public class AtomicIntegerDemo {

    public static void main(String[] args) {
        Number number = new Number();
        for (int i = 0; i <10 ; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    number.add();
                }
            },String.valueOf("线程:"+i)).start();
        }
        /*防止main方法执行，上面没有执行完*/
        /*为啥是2,因为默认main和GC两个线程*/
        while (Thread.activeCount()>2){
            System.err.println("检测到未执行完");
            Thread.yield();
        }
        System.err.println("====结果====="+number.i);
    }
}

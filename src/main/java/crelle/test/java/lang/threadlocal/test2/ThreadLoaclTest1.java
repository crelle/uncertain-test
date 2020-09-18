package crelle.test.java.lang.threadlocal.test2;

public class ThreadLoaclTest1 {
    public static void main(String[] args) throws InterruptedException {

        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set(true);

        Thread t1 = new Thread(() -> {
            threadLocal.set(false);
            System.out.println(Thread.currentThread().getName()+":"+threadLocal.get());
        });

        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName()+":"+threadLocal.get());
        });

        t1.start();
        t2.start();
        //等待t1线程执行完
        t1.join();
        //等待t2线程执行完
        t2.join();
        System.out.println(Thread.currentThread().getName()+":"+threadLocal.get());
    }
}

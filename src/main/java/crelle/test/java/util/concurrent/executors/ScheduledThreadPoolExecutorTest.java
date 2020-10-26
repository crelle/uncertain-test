package crelle.test.java.util.concurrent.executors;

import java.util.concurrent.*;

/**
 * @author:crelle
 * @className:ScheduledThreadPoolExecutorTest
 * @version:1.0.0
 * @date:2020/10/26
 * @description:XX
 **/
public class ScheduledThreadPoolExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        //test1();
        test2();
    }

    private static void test1() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        executor.schedule(() -> {
            System.out.println("Hello World");
        }, 5000, TimeUnit.MILLISECONDS);
    }

    private static void test2() throws InterruptedException {
        CountDownLatch lock = new CountDownLatch(3);

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        ScheduledFuture<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hello World");
            lock.countDown();
        }, 500, 200, TimeUnit.MILLISECONDS);

        lock.await(1000, TimeUnit.MILLISECONDS);
        future.cancel(true);
    }
}

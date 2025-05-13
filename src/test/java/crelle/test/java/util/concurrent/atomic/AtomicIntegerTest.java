package crelle.test.java.util.concurrent.atomic;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 张强
 * @since 2025/5/13 10:59
 */
public class AtomicIntegerTest {
    private static AtomicInteger count = new AtomicInteger(0);

    @Test
    public void test1() throws InterruptedException {
        int threadCount = 10;
        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    count.incrementAndGet();
                }
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("最终计数值：" + count.get()); // 期望值是 10 * 1000 = 10000
    }
}

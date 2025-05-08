package crelle.test.java.lang;

import org.junit.Test;

/**
 * @author 张强
 * @since 2025/5/8 14:21
 */
public class ThreadTest {
    @Test
    public void test1() {
        Thread thread1 = new Thread("t1") {
            @Override
            public void run() {
                System.out.println("11111");
            }
        };
        thread1.start();
    }

    @Test
    public void test2() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("22222");
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.setName("t2");
        thread2.start();
    }

    @Test
    public void test3() {
        Runnable runnable = () -> System.out.println("22222");
        Thread thread2 = new Thread(runnable);
        thread2.setName("t2");
        thread2.start();
    }
}

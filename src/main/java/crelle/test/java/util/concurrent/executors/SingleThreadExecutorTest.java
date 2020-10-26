package crelle.test.java.util.concurrent.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author:crelle
 * @className:SingleThreadExecutor
 * @version:1.0.0
 * @date:2020/10/26
 * @description:XX
 **/
public class SingleThreadExecutorTest {
    public static void main(String[] args) {
        test1();
        System.out.println("###############################");
        test2();
    }

    private static void test1(){
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> System.out.println("Hello World"));
    }

    /**
     *@author:crelle
     *@date:2020/10/26
     *@title:test2
     *@description: 单线程执行程序是创建事件循环的理想选择。
     * corePoolSize和maximumPoolSize参数等于1，keepAliveTime为零。
     *@params:[]
     *@return:void
     *@throw:
     */
    private static void test2(){
        AtomicInteger counter = new AtomicInteger();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            counter.set(1);
        });
        executor.submit(() -> {
            System.out.println(counter.compareAndSet(1, 2));
        });
        executor.submit(() -> {
            System.out.println(counter.compareAndSet(2, 3));
        });
        executor.submit(() -> {
            System.out.println(counter.compareAndSet(3, 4));
            System.out.println(counter.get());
        });
    }
}

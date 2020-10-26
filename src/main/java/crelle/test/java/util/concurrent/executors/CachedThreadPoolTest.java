package crelle.test.java.util.concurrent.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author:crelle
 * @className:cachedThreadPool
 * @version:1.0.0
 * @date:2020/10/26
 * @description:XX
 **/
public class CachedThreadPoolTest {
    public static void main(String[] args) {
        test1();
    }

    
    /**
     *@author:crelle
     *@date:2020/10/26
     *@title:test1
     *@description:核心线程数: 缓存的线程池可能会无限制地增长，以容纳任意数量的已提交任务。
     * 但是，当不再需要线程时，将在60秒钟不活动之后将其丢弃。
     * 一个典型的用例是您的应用程序中有很多短期任务。
     *
     * 上面的示例中的队列大小将始终为零，因为内部使用了SynchronousQueue实例。
     * 在SynchronousQueue中，成对的插入和删除操作总是同时发生，因此队列实际上从不包含任何内容。
     *@params:[]
     *@return:void
     *@throw:
     */
    private static void test1() {
        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newCachedThreadPool();
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });
        executor.submit(() -> {
            Thread.sleep(1000);
            return null;
        });

        System.out.println("pool size="+executor.getPoolSize());
        System.out.println("queue size="+executor.getQueue().size());
    }
}

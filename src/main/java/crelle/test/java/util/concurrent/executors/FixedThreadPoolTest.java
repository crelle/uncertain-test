package crelle.test.java.util.concurrent.executors;

import java.util.concurrent.*;

/**
 * @author:crelle
 * @className:FixedThreadPool
 * @version:1.0.0
 * @date:2020/10/26
 * @description:XX
 **/
public class FixedThreadPoolTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        test1();
        System.out.println("###################################");
        test2();
    }
    /**
     *@author:crelle
     *@date:2020/10/26
     *@title:test1
     *@description:submit方法可接受callable
     *@params:[]
     *@return:void
     *@throw:
     */
    private static void test1() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(() -> "Hello World");
        // some operations
        String result = future.get();
        System.out.println(result);
    }

    /**
     *@author:crelle
     *@date:2020/10/26
     *@title:test2
     *@description: newFixedThreadPool方法创建一个corePoolSize和maximumPoolSize参数值相等且keepAliveTime为零的ThreadPoolExecutor。
     * 这意味着该线程池中的线程数始终相同
     *@params:[]
     *@return:void
     *@throw:
     */
    private static void test2(){
        ThreadPoolExecutor executor =
                (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
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

        System.out.println(executor.getPoolSize());
        System.out.println( executor.getQueue().size());
    }
}

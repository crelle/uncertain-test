package crelle.test.java.util.concurrent;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 利用CountDownLatch异步转同步 主线程
 */
public class CountDownLatchTest {

    private static final int THREAD_COUNT_NUM = 7;
    private static CountDownLatch countDownLatch = new CountDownLatch(THREAD_COUNT_NUM);

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService =  Executors.newFixedThreadPool(10);
        try {
                for (int i = 1; i <= 7; i++) {
                    executorService.execute(new task(i,countDownLatch));
                }
                //等待检查，即上述7个线程执行完毕之后，执行await后边的代码
                countDownLatch.await();
                System.out.println("集齐七颗龙珠！召唤神龙！");
        }finally {
                executorService.shutdown();
        }
    }
}

    /**
     * 收集龙珠任务
     */
    class task implements Runnable {

        private int index = 0;
        private CountDownLatch  countDownLatch;

        public task(int index, CountDownLatch countDownLatch) {
            this.index = index;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            try {
                System.out.println("第" + index + "颗龙珠已收集到！");
                //模拟收集第i个龙珠,随机模拟不同的寻找时间
                Thread.sleep(new Random().nextInt(3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                //每收集到一颗龙珠,需要等待的颗数减1
                countDownLatch.countDown();
            }
        }
     }

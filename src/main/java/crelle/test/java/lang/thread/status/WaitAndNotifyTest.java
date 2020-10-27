package crelle.test.java.lang.thread.status;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author:crelle
 * @className:WaitAndNotifyTest
 * @version:1.0.0
 * @date:2020/10/27
 * @description:XX
 **/
public class WaitAndNotifyTest {

    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new BlockingQueue<Integer>();
        Executor executor = Executors.newCachedThreadPool();
        for (int i = 0; i <20 ; i++) {
            int finalI = i;
            executor.execute(()->{
                blockingQueue.put(finalI);
                System.out.println("finalI="+finalI);
                try {
                    System.out.println("take value="+blockingQueue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        System.out.print(blockingQueue);
    }
}

class BlockingQueue<T> {

    private List<T> queue = new LinkedList<T>();

    private int limit = 10;

    public synchronized void put(T item) {
        while (queue.size() == limit) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        if (queue.isEmpty()) {
            notifyAll();
        }
        queue.add(item);
    }

    public synchronized T take() throws InterruptedException {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        if (queue.size() == limit) {
            notifyAll();
        }
        return queue.remove(0);
    }

}

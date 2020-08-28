package crelle.test.java.util.concurrent.atomic;


import java.util.concurrent.atomic.AtomicLong;

/**
 * @author:crelle
 * @className:AtomicLongTest
 * @version:1.0.0
 * @date:2020/8/27
 * @description:AtomicLong test
 **/
public class AtomicLongTest {
    private  static AtomicLong sequenceNumber = new AtomicLong(0);
    public static void main(String[] args) throws InterruptedException {

                Thread thread1 = new Thread(new Task(sequenceNumber,100));
                Thread thread2 = new Thread(new Task(sequenceNumber,600));
                Thread thread3 = new Thread(new Task(sequenceNumber,1100));
                Thread thread4 = new Thread(new Task(sequenceNumber,1600));

                thread1.start();
                thread2.start();
                thread3.start();
                thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
    }
}


class Task implements Runnable {
    private AtomicLong sequenceNumber = null;
    private long time;

    public Task(AtomicLong atomicLong,long time) {
        this.sequenceNumber = atomicLong;
        this.time = time;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+":"+sequenceNumber.getAndIncrement());
            try {
            Thread.sleep(time);
            }catch (Exception e){

            }
        }
    }
}

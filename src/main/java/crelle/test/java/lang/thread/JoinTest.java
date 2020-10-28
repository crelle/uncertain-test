package crelle.test.java.lang.thread;

/**
 *@author:crelle
 *@date:2020/10/27
 *@title:
 *@description: join(),主线程等待join线程执行完后在执行
 *@params:
 *@return:
 *@throw:
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {

            Thread thread1 = new Thread(new task());
            thread1.start();
            thread1.join();
            Thread.sleep(1000*3);
            System.out.println("main thread is done!");
    }
}


class task implements  Runnable{

    @Override
    public void run() {
        try {
            System.out.println("start task!");
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end task!");

    }
}

package crelle.test.java.lang.thread;

public class JoinTest {
    public static void main(String[] args) throws InterruptedException {

            Thread thread1 = new Thread(new Thread1());
            System.out.println("线程名字："+thread1.getName());
            System.out.println("线程状态"+thread1.getState());
            System.out.println("线程组："+thread1.getThreadGroup());
            System.out.println("active thread count:"+Thread.activeCount());
            thread1.start();
            thread1.join(1000*1);
            System.out.println("is alive:"+thread1.isAlive());
            thread1.join(1000*2);
            System.out.println("is alive:"+thread1.isAlive());
            thread1.join(1000*3);
            System.out.println("is alive:"+thread1.isAlive());
            thread1.join(1000*4);
            System.out.println("is alive:"+thread1.isAlive());
            thread1.wait(1000*5);
            thread1.notify();
    }


}


class Thread1 implements  Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000*11);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("aaaaaaaaaaaaaaa");

    }
}

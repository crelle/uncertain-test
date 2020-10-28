package crelle.test.java.lang.thread;

import java.io.IOException;

/**
 * @author:crelle
 * @className:DeamonTest
 * @version:1.0.0
 * @date:2020/10/28
 * @description:主线程退出守护线程也退出
 **/
public class DaemonTest {

    public static void main(String[] args) throws IOException {
        Thread thread = new Thread(() -> {
            for (int i = 0; ; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                System.out.print(i);
            }
        });
        //设置为守护线程
        thread.setDaemon(true);
        thread.start();
        //主线程等待用户输入后退出
        System.in.read();
    }
}

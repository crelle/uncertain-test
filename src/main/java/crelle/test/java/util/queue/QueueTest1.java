package crelle.test.java.util.queue;

import org.apache.commons.collections4.QueueUtils;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author:crelle
 * @className:QueueTest1
 * @version:1.0.0
 * @date:2020/9/14
 * @description:队列，先进先出
 **/
public class QueueTest1 {
    public static void main(String[] args) {
        Queue<Integer> queue =new ArrayDeque<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("=============remove=============");
        //移除最先添加的元素
        System.out.println(queue.remove());
        System.out.println("=============forEach=============");
        queue.forEach(System.out::println);
        System.out.println("=============poll=============");
        System.out.println(queue.poll());
        System.out.println("=============forEach=============");
        queue.forEach(System.out::println);

    }
}

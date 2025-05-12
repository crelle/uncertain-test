package crelle.test.java.other;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张强
 * @since 2025/5/12 14:19
 */
public class JvmTest {


    /**
     * 测试创建学生对象列表并模拟长时间运行的线程
     * 此方法主要用于演示如何在测试环境中模拟并发场景
     * 它通过创建一个包含200个学生对象的列表来模拟一个数据集
     * 然后使用Thread.sleep()方法模拟一个长时间运行的线程，以测试或演示并发控制机制
     *
     * @throws InterruptedException 如果Thread.sleep()方法被中断
     */
    @Test
    public void test1() throws InterruptedException {
        // 初始化一个学生对象列表
        List<Student> studentList = new ArrayList<>();
        // 循环添加200个学生对象到列表中
        for (int i = 0; i < 200; i++) {
            studentList.add(new Student());
        }
        // 模拟长时间运行的线程，暂停当前线程
        Thread.sleep(1000000000L);
    }


    class Student {
        private byte[] big = new byte[1024 * 1024];
    }
}

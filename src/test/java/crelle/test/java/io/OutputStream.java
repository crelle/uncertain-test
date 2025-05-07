package crelle.test.java.io;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 张强
 * @since 2025/5/7 10:17
 */
public class OutputStream {

    /**
     * 1、参数是字符串表示的路径或者是File对象都是可以的
     * 2、如果文件不存在，会自动创建
     * 3、如果文件存在，会覆盖
     *
     * @param
     * @return
     * @auther 张强
     * @since 2025/5/7 10:44
     */
    @Test
    public void test1() throws IOException {
        System.out.println(System.getProperty("user.dir"));
        FileOutputStream fos = new FileOutputStream("a.txt");
        fos.write(97);
        fos.write(98);
        fos.close();
    }

    @Test
    public void test2() throws IOException {
        File file = new File("D:\\coding\\uncertain-test\\src\\main\\resources\\a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(97);
        fos.close();
    }

    @Test
    public void test3() throws IOException {
        File file = new File("D:\\coding\\uncertain-test\\src\\main\\resources\\a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        String str = "hello world";
        fos.write(str.getBytes());
        fos.close();
    }

    @Test
    public void test4() throws IOException {
        File file = new File("D:\\coding\\uncertain-test\\src\\main\\resources\\a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        String str = "hello world";
        fos.write(str.getBytes());
        fos.close();
    }

    /**
     * 测试方法test5，用于演示如何将字符串的一部分写入文件
     * 该方法首先创建一个File对象和一个FileOutputStream对象，然后将字符串"hello world"的部分内容写入文件中
     * 具体来说，它跳过第一个字符，将接下来的三个字符写入文件，最后关闭文件输出流
     *
     * @param 无
     * @return 无
     * @auther 张强
     * @since 2025/5/7 10:54
     */
    @Test
    public void test5() throws IOException {
        // 创建File对象，指向指定路径的文件
        File file = new File("D:\\coding\\uncertain-test\\src\\main\\resources\\a.txt");
        // 创建FileOutputStream对象，用于写入文件
        FileOutputStream fos = new FileOutputStream(file);
        // 定义待写入的字符串
        String str = "hello world";
        // 将字符串转换为字节数组，并从索引1开始，写入3个字节到文件中
        fos.write(str.getBytes(), 1, 3);
        // 关闭文件输出流
        fos.close();
    }

}

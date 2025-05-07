package crelle.test.java.io;


import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 张强
 * @since 2025/5/7 10:17
 */
public class InputStream {
    @Test
    public void test1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\coding\\uncertain-test\\src\\main\\resources\\a.txt");
        while (fis.available() > 0) {
            System.out.println((char) fis.read());
        }
    }

    @Test
    public void test2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\coding\\uncertain-test\\src\\main\\resources\\a.txt");
        FileOutputStream fos = new FileOutputStream("D:\\coding\\uncertain-test\\src\\main\\resources\\b.txt");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();
    }

}

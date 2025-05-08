## java 基础

### io

#### 基本介绍

输入流 ,输出流  
字节流，字符流

#### 常用类

OutputStream  
|- FileOutputStream

InputStream  
|- FileInputStream

Reader  
|- FileReader

Writer  
|- FileWriter

#### 常用方法

OutputStream  
|- FileOutputStream  
| |- #FileOutputStream

InputStream  
|- FileInputStream

Reader  
|- FileReader

Writer  
|- FileWriter

#### 代码示例

```java
/**
 * @author 张强
 * @since 2025/5/7 10:17
 */
public class OutputStream {

    /**
     * @param 无
     * @return 无
     * @auther 张强
     * @since 2025/5/7 10:54
     */
    @Test
    public void test1() throws IOException {
        // 创建File对象，指向指定路径的文件
        File file = new File("D:\\coding\\uncertain-test\\src\\main\\resources\\a.txt");
        // 创建FileOutputStream对象，用于写入文件
        FileOutputStream fos = new FileOutputStream(file, false);
        // 定义待写入的字符串
        String str = "hello world";
        // 将字符串转换为字节数组，并从索引1开始，写入3个字节到文件中
        fos.write(str.getBytes(), 1, 3);
        // 关闭文件输出流
        fos.close();
    }

    @Test
    public void test2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\coding\\uncertain-test\\src\\main\\resources\\a.txt");
        while (fis.available() > 0) {
            System.out.println((char) fis.read());
        }
    }

}
```















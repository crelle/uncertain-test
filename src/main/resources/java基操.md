##  java 基础
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
        FileOutputStream fos = new FileOutputStream(file,false);
        // 定义待写入的字符串
        String str = "hello world";
        // 将字符串转换为字节数组，并从索引1开始，写入3个字节到文件中
        fos.write(str.getBytes(), 1, 3);
        // 关闭文件输出流
        fos.close();
    }

    @Test
    public void test2() throws IOException {
        FileInputStream  fis = new FileInputStream("D:\\coding\\uncertain-test\\src\\main\\resources\\a.txt");
        while (fis.available()>0){
            System.out.println((char)fis.read());
        }
    }

}
```

### 反射
#### 基本介绍
反射是java语言提供的一种动态获取类信息的机制  
 . 获取公共的成员变量, 公共的成员方法, 构造方法  
 . 通过设置属性可访问性为ture获取私有的成员变量, 私有的成员方法, 私有的构造方法

#### 常用类
|- Class  
|- Field  
|- Method  
|- Constructor  

#### 代码示例
```java
public class ReflectTest {

    @Test
    public void test1() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("crelle.test.java.auxiliary.beans.Student");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    @Test
    public void test2() {
        Student student = new Student();
        Class<? extends Student> aClass1 = student.getClass();
        Method[] methods = aClass1.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    @Test
    public void test3() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Student.class;
        Constructor<?>[] constructors = aClass.getConstructors();
        Student student = (Student) constructors[0].newInstance();
        student.setName("zhangsan");
        student.setAge(19);
        System.out.println(student.getName());

    }
}
```
![拷贝过程示意图](img.png)
















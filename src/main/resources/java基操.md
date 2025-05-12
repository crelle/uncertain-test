## java 基础

### io

#### 基本介绍

输入流 ,输出流  
字节流，字符流  
非阻塞io，异步io

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

### 泛型

### 注解

### 集合

### 并发编程
1. 线程与进程  
进程:进程可以视为程序的运行实例，大部分的程序都是运行在进程内的，进程是操作系统资源分配的基本单位。  
线程:而线程是进程的运行单元。
2. 并行,并发 
并发:多个线程同时操作一个资源。  
并行:一个线程同时操作多个资源。
3. 异步与同步  
同步：需要等待其他线程操作完毕后才能继续操作。  
异步：不需要等待其他线程操作完毕就可以继续操作。
4. 单核与多核  
单核:一个CPU核串行执行。  
多核:多个CPU核并行执行。

#### 常用类
Object  
|- java.lang.Thread  
|- java.lang.Runnable  
|- java.util.concurrent.Callable  
|- java.util.concurrent.Future  
|- ThreadPoolExecutor  
|- java.util.concurrent.Executor  
| | - java.util.concurrent.ExecutorService  
| | | - java.util.concurrent.ScheduledExecutorService  
| | | |- java.util.concurrent.ScheduledThreadPoolExecutor
|- Executors  
|- CountDownLatch  
|- CyclicBarrier  
![img_1.png](img_1.png)

![img_2.png](img_2.png)
#### java中手动创建线程的三种方式
```java
public class ThreadTest {
    @Test
    public void test1() {
        Thread thread1 = new Thread("t1") {
            @Override
            public void run() {
                System.out.println("11111");
            }
        };
        thread1.start();
    }

    @Test
    public void test2() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("22222");
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.setName("t2");
        thread2.start();
    }

    @Test
    public void test1() throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<Integer>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });

        Thread t1 = new Thread(task,"t1");
        t1.start();
        System.out.println(task.get());
    }
}
```

#### 线程上下文切换
1、 线程的cpu时间片用完  
2、 垃圾回收  
3、 线程的等待,同步,阻塞等操作  
4、 高优先级线程需要执行  
频繁的上下文切换会消耗大量的CPU资源，所以尽量避免频繁的上下文切换。
线程数不要超过CPU核数。使用固定的线程数，避免频繁的上下文切换。

#### 临界区
一段代码块内如果存在对共享资源的多线程读写操作，称这段代码块为临界区。
```java
static int counter = 0;
public void increment() {
    //临界区
        counter++;
}
public void decrement() {
    //临界区
    counter--;
}
```
#### 临界区线程安全问题解决方案
1. 阻塞式的解决方案：synchronized，Lock
2. 非阻塞式的解决方案：原子变量(CAS)
### JUC

#### ReentrantLock 可重入锁
1. 可重入：同一个线程外层函数获得锁后，内层递归函数仍然有锁的访问权。  
2. 可打断：在等待锁期间，被打断的线程可以感知到，并抛出异常。  
3. 可超时:等待锁期间，可以设置超时时间，超时后线程会自动放弃锁。
4. 公平性  

#### volatitle
 1. volatile修饰成员变量和静态成员变量，从主存中获取值不从缓存中获取值，保证可见性，不保证原子性。

### JMM

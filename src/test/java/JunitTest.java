import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class JunitTest {

    @org.junit.Test
    public void test1(){
        System.out.println(1123);
    }

    @org.junit.Test
    public void test2(){
        System.out.println("abc");
    }

    @org.junit.Test
    public  void test3() throws IOException {
        URL url = new URL("https://fanyi.baidu.com/translate?aldtype=16047&query=&keyfrom=baidu&smartresult=dict&lang=auto2zh#zh/en/%E4%B8%AD%E5%9B%BD");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.connect();
        InputStream in = httpURLConnection.getInputStream();
        byte[] reponseByte = new byte[in.available()];
        in.read(reponseByte);
        String responseStr = new String(reponseByte,"UTF-8");
        System.out.println(responseStr);
    }

    @org.junit.Test
    public void test4() throws IOException {
        FileReader fileReader = new FileReader("E:\\test.txt");
        FileWriter fileWriter = new FileWriter("E:\\testNew.txt");
        int i = 0;
        while (( i =fileReader.read())!=-1){
            System.out.println((char)i);
            fileWriter.write(i);
        }
        fileReader.close();
        fileWriter.flush();
        fileWriter.close();
    }

    @Test
    public void test5() throws IOException {
        FileWriter fileWriter = new FileWriter("E:\\testNew.txt");
        fileWriter.write("我爱你中国");
        fileWriter.write(13);
        fileWriter.write(10);
        fileWriter.write("97");
//        fileWriter.write(97);
//        fileWriter.write(98);
//        fileWriter.write(99);
//        fileWriter.write(100);
        fileWriter.flush();
        fileWriter.close();
    }

    /**
     *测试hash算法
     */
    @Test
    public void test6() throws NoSuchAlgorithmException {
        String base = "这是测试字段！这是测试字段！这是测试字段！这是测试字段！这是测试字段！这是测试字段！这是测试字段！这是测试字段！";
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            System.out.println("hash数组长度："+hash.length);
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

           String otherStr = test6_1("这 是测试字段！这是测试字段！这是测试字段！这是测试字段！这是测试字段！这是测试字段！这是测试字段！这是测试字段！");
            System.out.println("是否相等："+otherStr.equals(hexString.toString()));
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }

    private String test6_1(String str) throws NoSuchAlgorithmException {
            StringBuffer hexString = new StringBuffer();
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] hash = digest.digest(str.getBytes("UTF-8"));
            System.out.println("hash数组长度：" + hash.length);

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            System.out.println("长度：" + hexString.length() + ",结果：" + hexString.toString());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return hexString.toString();
    }

    /**
     * ThreadPoolExecutor
     */
    @Test
    public void test7(){
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

        //Stats before tasks execution
        System.out.println("Largest executions: "
                + executor.getLargestPoolSize());
        System.out.println("Maximum allowed threads: "
                + executor.getMaximumPoolSize());
        System.out.println("Current threads in pool: "
                + executor.getPoolSize());
        System.out.println("Currently executing threads: "
                + executor.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): "
                + executor.getTaskCount());

        executor.submit(new Task());
        executor.submit(new Task());

        // aStatsfter tasks execution
        System.out.println("Core threads: " + executor.getCorePoolSize());
        System.out.println("Largest executions: "
                + executor.getLargestPoolSize());
        System.out.println("Maximum allowed threads: "
                + executor.getMaximumPoolSize());
        System.out.println("Current threads in pool: "
                + executor.getPoolSize());
        System.out.println("Currently executing threads: "
                + executor.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): "
                + executor.getTaskCount());

        executor.shutdown();
    }

    static class Task implements Runnable {

        public void run() {

            try {
                Long duration = (long) (Math.random() * 5);
                System.out.println("Running Task! Thread Name: " +
                        Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(duration);
                System.out.println("Task Completed! Thread Name: " +
                        Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

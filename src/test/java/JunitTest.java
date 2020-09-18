import com.fasterxml.jackson.annotation.JsonFormat;
import crelle.test.java.auxiliary.beans.Person;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

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

    @Test
    public void test08() throws InterruptedException {
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(5);
        for (int i = 0; i < 5; ++i) {
            // create and start threads
            new Thread(new Worker(startSignal, doneSignal)).start();
        }
        System.out.println("aaaaaaaaaaaa");
        // don't let run yet
        startSignal.countDown();
        // let all threads proceed
        System.out.println("bbbbbbbbbbbbbbbbb");
        doneSignal.await();
        // wait for all to finish
    }



    class Worker implements Runnable {
        private final CountDownLatch startSignal;
        private final CountDownLatch doneSignal;
        Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
            this.startSignal = startSignal;
            this.doneSignal = doneSignal;
        }
        public void run() {
            try {
                startSignal.await();
                doWork();
                doneSignal.countDown();
            } catch (InterruptedException ex) {} // return;
        }

        void doWork() {
            System.out.println("do work!");
        }
    }

    @Test
    public  void test8() throws InterruptedException {
        CountDownLatch doneSignal = new CountDownLatch(5);
        Executor e = Executors.newFixedThreadPool(1);

        for (int i = 0; i < 5; ++i) // create and start threads
            e.execute(new WorkerRunnable(doneSignal, i));
            doneSignal.await();           // wait for all to finish
    }

    class WorkerRunnable implements Runnable {
        private final CountDownLatch doneSignal;
        private final int i;
        WorkerRunnable(CountDownLatch doneSignal, int i) {
            this.doneSignal = doneSignal;
            this.i = i;
        }
        public void run() {
            doWork(i);
            doneSignal.countDown();
        }

        void doWork(int i) {
            System.out.println(i);
        }
    }

    @Test
    public void test9(){
        List<String> lists = new ArrayList<String>();
        List<String> newLists = new ArrayList<String>();
        lists.add("1111");
        lists.add("2222");
        lists.add("3333");
        lists.forEach(list->{
            if(null!=list){
                newLists.add(list+"aa");
            }
        });
        newLists.forEach(list->{
            if(null!=list){
              System.out.println(list);
            }
        });
    }
    @JsonFormat(pattern = "yyyy-MM-DD HH:mm:ss")
    private Date date;
    @Test
    public void test10(){
        System.out.println(Locale.getDefault());
        System.out.println(TimeZone.getDefault());
        System.out.println(date);
    }

    @Test
    public void test11(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","zhangsan");
        map.put("age",12);
        Map<String,Object> map1 = new HashMap<String,Object>();
        map.put("name","lisi");
        map.put("age",13);
        Map<String,Object> map2 = new HashMap<String,Object>();
        map.put("name","wangwu");
        map.put("age",14);
        List<Map<String,Object>> mapList = new ArrayList<Map<String, Object>>();
        mapList.add(map);
        mapList.add(map1);
        mapList.add(map2);

        mapList.parallelStream().map(obj->{
            Person person = new Person();
            person.setName(MapUtils.getString(obj,"name"));
            person.setAge(MapUtils.getByte(obj,"age"));
            return person;
        }).forEach(person -> {
            System.out.println(person.getName()+"年龄"+person.getAge());
        });
    }

    @Test
    public void test12() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

       java.util.Date date = simpleDateFormat.parse("2020-12-31");
        java.util.Date date1 = simpleDateFormat.parse("2020-09-07");
       long milldate = date.getTime();
       long milldate1 =  date1.getTime();
       System.out.println((milldate-milldate1)/(1000*60*60*24*7));


    }

    @Test
    public void test13(){
       Map<String,String> map = new HashMap<String,String>(100000000);
       map.put("a","1");
       System.out.println(map.put("a","2"));
        System.out.println(map.put("b","3"));
       System.out.println(map.get("a"));
    }

    @Test
    public void test14(){

    }

    @Test
    public void test15(){
        test14();
    }




}

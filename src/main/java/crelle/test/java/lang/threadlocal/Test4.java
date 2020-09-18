package crelle.test.java.lang.threadlocal;

/**
 * @author:crelle
 * @className:Test4
 * @version:1.0.0
 * @date:2020/9/18
 * @description:XX
 **/
public class Test4 {
    private static  int i = 10;

    static Thread thread1 = new Thread(() -> {
          ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
            @Override
            protected Integer initialValue() {
                return new Integer(i--);
            }
        };
        System.out.println(threadLocal.get());
    });
    static Thread thread2 = new Thread(() -> {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
            @Override
            protected Integer initialValue() {
                return new Integer(i--);
            }
        };
        System.out.println(threadLocal.get());
    });
    static Thread thread3 = new Thread(() -> {

        ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
            @Override
            protected Integer initialValue() {
                return new Integer(i--);
            }
        };
        System.out.println(threadLocal.get());
    });

    public static void main(String[] args) {
       thread1.start();
       thread2.start();
       thread3.start();
    }


}

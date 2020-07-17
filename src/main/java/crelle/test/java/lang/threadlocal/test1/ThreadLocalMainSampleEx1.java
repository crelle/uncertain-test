package crelle.test.java.lang.threadlocal.test1;

import crelle.test.java.lang.threadlocal.test1.CustomThreadLocal;
import crelle.test.java.lang.threadlocal.test1.PrintThreadContextValues;
import crelle.test.java.lang.threadlocal.test1.ThreadContext;

public class ThreadLocalMainSampleEx1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                ThreadContext threadContext = new ThreadContext();
                threadContext.setTransactionId(1L);
                threadContext.setUserId("User 1");
                CustomThreadLocal.add(threadContext);
                //here we call a method where the thread context is not passed as parameter
                PrintThreadContextValues.printThreadContextValues();
            }
        }).start();
        new Thread(new Runnable() {

            @Override
            public void run() {
                ThreadContext threadContext = new ThreadContext();
                threadContext.setTransactionId(2L);
                threadContext.setUserId("User 2");
                CustomThreadLocal.add(threadContext);
                //here we call a method where the thread context is not passed as parameter
                PrintThreadContextValues.printThreadContextValues();
            }
        }).start();
    }
}

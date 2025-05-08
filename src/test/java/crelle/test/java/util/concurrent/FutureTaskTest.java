package crelle.test.java.util.concurrent;


import org.junit.Test;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 张强
 * @since 2025/5/8 15:57
 */
public class FutureTaskTest {

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

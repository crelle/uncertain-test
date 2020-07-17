package crelle.test.java.lang.math;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 *
 * static double	random()
 * Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
 */
public class RandomTest {
    static CountDownLatch countDownLatch = new CountDownLatch(2);
    static ConcurrentHashMap<Double,Double> concurrentHashMap = new ConcurrentHashMap<Double, Double>();
    public static void main(String[] args) throws InterruptedException {
        //0.0<= x <1.0
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    for (int i = 0;i<10;i++) {
                        Double val = Math.random();
                        concurrentHashMap.put(val, val);
//                        System.out.println(val);
                            Thread.sleep(10);
                    }
                }catch (InterruptedException e){
                }
                finally {
                    countDownLatch.countDown();
                }
            }
        }).start();


        Random random = new Random();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    for (int i =0;i<10;i++){
                        Double val = Double.valueOf(random.nextInt(10));
                        concurrentHashMap.put(val,val);
//                        System.out.println(val);

                            Thread.sleep(10);

                        }
                }catch (InterruptedException e){

                }finally {
                 countDownLatch.countDown();
                }
            }
        }).start();

        countDownLatch.await();
        Set<Map.Entry<Double,Double>> entrySets = concurrentHashMap.entrySet();
        for (Map.Entry<Double,Double> entrySet:entrySets) {
            System.out.println(entrySet.getKey());
        }



    }
}

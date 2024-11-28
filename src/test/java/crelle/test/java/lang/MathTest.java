package crelle.test.java.lang;

import org.junit.Test;

/**
 * @Author: 张强
 * @Date: 2024/7/24 0:55
 * @Description:
 */
public class MathTest {
    @Test
    public void test1() {

        System.out.println(getForEachCount(0,100));
    }


    private int getForEachCount(long total, int pageSize) {
        if (total <= pageSize) {
            return 0;
        }
        double dtotal = total;
        double dpageSize = pageSize;
        return (int) Math.ceil(dtotal / dpageSize);
    }

}

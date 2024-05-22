package crelle.test.java.test;

import crelle.test.java.auxiliary.beans.StoreType;
import org.junit.Test;


/**
 * @Author: 张强
 * @Date: 2024/5/22 16:04
 * @Description:
 */
public class EnumTest {
    @Test
    public void test1() {
        StoreType storeType = StoreType.SASS_STORE;
        StoreType storeType1 = StoreType.SASS_STORE;
        if(storeType1 == storeType){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

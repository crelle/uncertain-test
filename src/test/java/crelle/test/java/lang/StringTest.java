package crelle.test.java.lang;


import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author:crelle
 * @className:StringTest
 * @version:1.0.0
 * @date:2021/5/19
 * @description:XX
 **/
public class StringTest {

    public void test1(String... strings) {
        System.out.println(strings);
    }

    @Test
    public void test2() {
        test1("a", "b", "c");
    }

    @Test
    public void test3() {
        String input = "http://139.196.125.106:85/horizon/oss/statics/public/32c8d8d126164b2d95769bd97a589641.png";
        String[] temp = input.split("/public/");
        System.out.println("结果是:"+temp[1]);
    }

    @Test
    public void test4() {
        String input = "a/b/c";
        String[] result = input.split("/b/");
        if (result != null && result.length == 2) {
            System.out.println(input);
            System.out.println(result[0]);
            System.out.println(result[1]);
        }

    }

    @Test
    public void test5() {
        BigInteger input1 = new BigInteger("1");
        String input2 = "1";
        if (String.valueOf(input1).equals(input2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    @Test
    public void test6() {
        String dealerInfo = "福特南";
        String customerInfo = "维修厂";
        StringBuffer sb = new StringBuffer();

            int dealerNameSize = dealerInfo.length();
            if (dealerNameSize > 6) {
                dealerNameSize = 6;
            }
            sb.append(dealerInfo, 0, dealerNameSize);


            int customerNameSize = customerInfo.length();
            if (customerNameSize > 6) {
                customerNameSize = 6;
            }
            sb.append("&");
            sb.append(customerInfo, 0, customerNameSize);
            sb.append("仓配群");

        System.out.println(sb);
    }

    @Test
    public void test7() throws Exception {
//        CodeGeneration codeGeneration = new CodeGeneration();
//        codeGeneration.setDbIp("58.240.18.170");
//        codeGeneration.setDbPort("12083");
//        codeGeneration.setDbName("jt-db");
//        codeGeneration.setUsername("postgres");
//        codeGeneration.setPassword("Archer@post32");
//        codeGeneration.setJdbcType("postgresql");
//        codeGeneration.setParentPackageName("crelle.test");
//        codeGeneration.setModuleName("test");
//        codeGeneration.setTablePrefix("t_");
//        codeGeneration.setTableNames(Arrays.asList("t_device_data","t_alert_handle","t_devices"));
//        codeGeneration.run();
    }
}


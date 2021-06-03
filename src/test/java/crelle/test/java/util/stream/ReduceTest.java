package crelle.test.java.util.stream;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

/**
 * @author:crelle
 * @className:ReduceTest
 * @version:1.0.0
 * @date:2021/5/18
 * @description:XX
 **/
public class ReduceTest {

    @Test
    public void AddTest() {
        List<Person> peoples = Utils.getPersonsLists();

        MathContext mathContext = new MathContext(10, RoundingMode.UP);
        BigDecimal totalMoney = peoples.stream().map(person -> {
            if (null != person.getMoney()) {
                return person.getMoney();
            } else {
                return new BigDecimal(0,mathContext);
            }
        }).reduce(BigDecimal.ZERO, (a,b)->{
         return a.add(b,mathContext);
        });
        System.out.println(totalMoney);
    }
}

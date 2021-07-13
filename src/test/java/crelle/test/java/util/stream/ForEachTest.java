package crelle.test.java.util.stream;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

public class ForEachTest {

    @Test
    public void BreakTest() {
     List<Person> peoples = Utils.getPersonsLists();
     peoples.stream().forEach(
             person -> {
//                 if(person.getName().equals("tom")){
                     System.out.println(person.getName());

//                 }
             }
     );
    }
}

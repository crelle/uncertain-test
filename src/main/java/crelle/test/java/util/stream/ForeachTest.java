package crelle.test.java.util.stream;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;
import org.junit.Test;

import java.util.List;

/**
 * @author:crelle
 * @className:ForeachTest
 * @version:1.0.0
 * @date:2021/3/15
 * @description:XX
 **/
public class ForeachTest {


    @Test
    public void test1(){
        List<Person> oldList  = Utils.getPersonsLists();
        oldList.forEach(Person::printPerson);
        System.out.println("#######################");
        oldList.stream().forEach(person -> person.setAge(11111111));
//        oldList.forEach(person -> person.setAge(222222222));

        oldList.forEach(Person::printPerson);
    }
}

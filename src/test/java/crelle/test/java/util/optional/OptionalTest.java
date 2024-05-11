package crelle.test.java.util.optional;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Administrator on 2024/4/24.
 *
 * @author 张强
 */
public class OptionalTest {

    @Test
    public void test1() {
        String input = null;
        boolean present = Optional.ofNullable(input).isPresent();
        System.out.println(present);
    }

    @Test
    public void test2() {
        String input = null;
        String a = Optional.ofNullable(input).orElse("a");
        System.out.println(a);
    }

    @Test
    public void test3() {
        String input = null;
        String a = Optional.ofNullable(input).orElse("b");
        System.out.println(a);
    }

    @Test
    public void test4() {
        List<Person> personList = Utils.getPersonsLists();
        Person person = new Person();
        List<Person> personList1 = Optional.ofNullable(personList).orElse(Arrays.asList(person));
        System.out.println(personList1);
    }
}

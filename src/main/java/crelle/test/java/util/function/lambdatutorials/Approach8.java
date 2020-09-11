package crelle.test.java.util.function.lambdatutorials;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author:crelle
 * @className:Approach1
 * @version:1.0.0
 * @date:2020/8/15
 * @description: Specify Search Criteria Code with a Lambda Expression
 **/
public class Approach8 {
    public static void main(String[] args) {
        processPersonsWithFunction(
                Utils.getPersonsLists(),
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 16
                        && p.getAge() <= 25,
                p -> p.getEmailAddress(),
                email -> System.out.println(email)
        );
    }

    public static void processPersonsWithFunction(
            List<Person> roster,
            Predicate<Person> tester,
            Function<Person, String> mapper,
            Consumer<String> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
}


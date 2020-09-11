package crelle.test.java.util.function.lambdatutorials;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author:crelle
 * @className:Approach1
 * @version:1.0.0
 * @date:2020/8/15
 * @description: Use Lambda Expressions Throughout Your Application
 **/
public class Approach7 {
    public static void main(String[] args) {
        processPersons(Utils.getPersonsLists(), p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 16 && p.getAge() <= 25, p -> p.printPerson()
        );
    }

    public static void processPersons(
            List<Person> roster,
            Predicate<Person> tester,
            Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }
}


package crelle.test.java.util.function.lambdatutorials;

import crelle.test.java.auxiliary.Utils;
import crelle.test.java.auxiliary.beans.Person;

import java.util.List;

/**
 * @author:crelle
 * @className:Approach1
 * @version:1.0.0
 * @date:2020/8/15
 * @description: Specify Search Criteria Code in a Local Class
 **/
public class Approach3 {
    public static void main(String[] args) {
        printPersons(Utils.getPersonsLists(), new CheckPersonEligibleForSelectiveService());
    }


    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}


class CheckPersonEligibleForSelectiveService implements CheckPerson {
    public boolean test(Person p) {
        return p.getGender() == Person.Sex.MALE &&
                p.getAge() >= 14 &&
                p.getAge() <= 25;
    }
}

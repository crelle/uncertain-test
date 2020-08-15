package crelle.test.java.util.function.lambdatutorials;

import crelle.test.java.other.Utils;
import crelle.test.java.other.beans.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:crelle
 * @className:Approach1
 * @version:1.0.0
 * @date:2020/8/15
 * @description: Create Methods That Search for Members That Match One Characteristic
 **/
public class Approach1 {
    public static void main(String[] args) {
        printPersonsOlderThan(Utils.getPersonsLists(),16);
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
}

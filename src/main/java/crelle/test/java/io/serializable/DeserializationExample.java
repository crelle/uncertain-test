package crelle.test.java.io.serializable;

/**
 * @author:crelle
 * @className:DeserializationExample
 * @version:1.0.0
 * @date:2020/9/18
 * @description:XX
 **/
// Java program to illustrate creation of Object
// using Deserialization.
import crelle.test.java.auxiliary.beans.Person;

import java.io.*;

public class DeserializationExample
{
    public static void main(String[] args)
    {
        try
        {
            Person person;
            FileInputStream f = new FileInputStream("person.txt");
            ObjectInputStream oos = new ObjectInputStream(f);
            person = (Person) oos.readObject();
            System.out.println(person.getName());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}

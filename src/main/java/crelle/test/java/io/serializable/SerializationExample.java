package crelle.test.java.io.serializable;

/**
 * @author:crelle
 * @className:DeserializationExample
 * @version:1.0.0
 * @date:2020/9/18
 * @description:XX
 **/
// Java program to illustrate Serializing
// an Object.
import crelle.test.java.auxiliary.beans.Person;

import java.io.*;

class SerializationExample
{

    public static void main(String[] args)
    {
        try
        {
            Person d = new Person("crelle");
            FileOutputStream f = new FileOutputStream("person.txt");
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(d);
            oos.close();
            f.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

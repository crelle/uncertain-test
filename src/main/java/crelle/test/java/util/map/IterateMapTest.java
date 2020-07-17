package crelle.test.java.util.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 五种方法遍历map，取出map中的key,value
 */
public class IterateMapTest {
}

// Java program to demonstrate iteration over
// Map.entrySet() entries using for-each loop
class IterationDemo1
{
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry : gfg.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
}

// Java program to demonstrate iteration over
// Map using keySet() and values() methods

class IterationDemo2
{
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // using keySet() for iteration over keys
        for (String name : gfg.keySet())
            System.out.println("key: " + name);

        // using values() for iteration over keys
        for (String url : gfg.values())
            System.out.println("value: " + url);
    }
}

// Java program to demonstrate iteration over
// Map using keySet() and values() methods
class IterationDemo3
{
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // using iterators
        Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
}


// Java code illustrating iteration
// over map using forEach(action) method
class IterationDemo4
{
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // forEach(action) method to iterate map
        gfg.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

    }
}



// Java program to demonstrate iteration
// over keys and searching for values
class IterationDemo5
{
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // looping over keys
        for (String name : gfg.keySet())
        {
            // search for value
            String url = gfg.get(name);
            System.out.println("Key = " + name + ", Value = " + url);
        }
    }
}






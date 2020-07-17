package crelle.test.java.lang.threadlocal.test1;

import crelle.test.java.lang.threadlocal.test1.CustomThreadLocal;

public class PrintThreadContextValues {

    public static void printThreadContextValues(){
        System.out.println(CustomThreadLocal.get());
    }
}

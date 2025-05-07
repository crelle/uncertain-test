package crelle.test.java.annotation;

import crelle.test.java.auxiliary.beans.MyAnnotation;

/**
 * @author 张强
 * @since 2025/5/6 16:37
 */
@MyAnnotation(aaa = "1", bbb = false, ccc = {"1", "2"})
public class MyAnnotationTest {

    @MyAnnotation(aaa = "1")
    public void test1() {

    }
}

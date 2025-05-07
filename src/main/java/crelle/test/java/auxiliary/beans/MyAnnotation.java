package crelle.test.java.auxiliary.beans;

/**
 * @author 张强
 * @since 2025/5/6 16:35
 */
public @interface MyAnnotation {

    String aaa();

    boolean bbb() default true;

    String[] ccc() default {"1", "2"};
}

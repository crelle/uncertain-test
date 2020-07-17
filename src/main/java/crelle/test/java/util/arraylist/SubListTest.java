package crelle.test.java.util.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * subList返回的是ArrayList的内部类SubList,并不是ArrayList而是ArrayList的一个视图，
 * 对于SubList子列表的所有操作最终会反映到原列表上
 */
public class SubListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

      List list =  arrayList.subList(0,2);
      System.out.println(list);
      list.add("a");
      System.out.println(list);
      System.out.println(arrayList);
    }
}

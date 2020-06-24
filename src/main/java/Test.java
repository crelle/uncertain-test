import java.io.*;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        test12();
    }

    public static  void test1(){
        BigDecimal bigDecimal = new BigDecimal("300000000036");
        System.out.println(bigDecimal.intValue());
    }

    public static void test2(){
       if ("/sgpmss/src/com/sgpmss/appws/interfaceCenter/logic/impl/InfBasicLogic.java".contains("/spgmss/src/"))
       {
           System.out.print("true");
       }else{
           System.out.print("false");
       }

    }

    public static void test3() throws IOException {
        File file = new File("e:/a/b/v/b/InfBasicLogic.java");
        System.out.print("############"+file.getParent());
    }

    public static void test4(){
        String arr  ="InfBasicLogic.java".substring(0,"InfBasicLogic.java".indexOf("."));
        String arr1  ="InfBasicLogic.java".substring("InfBasicLogic.java".indexOf(".")+1,"InfBasicLogic.java".length());
        System.out.print(arr+"#######"+arr1);
    }

    public static void test5() throws IOException {
       // 指定路径如果没有则创建并添加
        File file = new File("e:\\yxskapp\\sgpmss_ctrl\\WEB-INF\\classes\\com\\sgpmss\\appws\\interfaceCenter\\logic\\impl\\test.java");
       //获取父目录
        File fileParent = file.getParentFile();
        //判断是否存在
        if (!fileParent.exists()) {
            // 创建父目录文件
            fileParent.mkdirs();
        }
        file.createNewFile();

    }

    public static void test6(){
      String str =   "\r\nabcd";
      str = str.replace("\r\n","");
      System.out.print(str);

    }

    public static void test7(){
        int[]  arr = {1,2,3,4};
        int [] arrNew = Arrays.copyOf(arr,arr.length-1);
        System.out.println(arrNew);

    }


    public static void test8(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
            try {

            }catch (Exception e){
            }finally {
            scanner.close();
            }
        }
    }

    public static void test9(){
        Map map = new HashMap<String,Object>();
        map.put("isSuccess",false);
        if((Boolean) map.get("isSuccess")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static void test10() throws IOException {
        URL url = new URL("http://127.0.0.1:8080/index");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.connect();
        InputStream in = httpURLConnection.getInputStream();
        byte[] reponseByte = new byte[in.available()];
        in.read(reponseByte);
        String responseStr = new String(reponseByte,"UTF-8");
        System.out.println(responseStr);
    }

    public static void test11(){
        Map map = new HashMap();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        Set set =  map.entrySet();
        while (set.iterator().hasNext()){
            System.out.println(set.iterator().next());
        }
    }

    /**
     * FileWriter.read()
     * @throws IOException
     */
    private static void test12() throws IOException {
        FileReader fileReader = new FileReader("E:\\test.txt");
        FileWriter fileWriter = new FileWriter("E:\\testNew.txt");
        int i = 0;
        while (( i =fileReader.read())!=-1){
           System.out.println((char)i);
           fileWriter.write(i);
        }
        fileReader.close();
        fileWriter.flush();
        fileWriter.close();
    }

    private static void test13(){

    }




}

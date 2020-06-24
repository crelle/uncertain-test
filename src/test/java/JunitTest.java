import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class JunitTest {

    @org.junit.Test
    public void test1(){
        System.out.println(1123);
    }

    @org.junit.Test
    public void test2(){
        System.out.println("abc");
    }

    @org.junit.Test
    public  void test3() throws IOException {
        URL url = new URL("https://fanyi.baidu.com/translate?aldtype=16047&query=&keyfrom=baidu&smartresult=dict&lang=auto2zh#zh/en/%E4%B8%AD%E5%9B%BD");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.connect();
        InputStream in = httpURLConnection.getInputStream();
        byte[] reponseByte = new byte[in.available()];
        in.read(reponseByte);
        String responseStr = new String(reponseByte,"UTF-8");
        System.out.println(responseStr);
    }

    @org.junit.Test
    public void test4() throws IOException {
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

}

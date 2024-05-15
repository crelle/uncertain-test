package crelle.test.java.net;

import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2024/5/13.
 *
 * @author 张强
 */
public class UrlTest {

    @Test
    public  void tset1(){
        // 获取项目的根目录
        String rootPath = System.getProperty("user.dir");

        String imageUrl = "http://139.196.125.106:85/horizon/oss/statics/public/32c8d8d126164b2d95769bd97a589641.png";
        String destinationFile = "/opt/uploadfiles/orderManage/32c8d8d126164b2d95769bd97a589641.png";
        String cookieHeader = "JSESSIONID=54020f0f-4f47-48b9-878a-e0ed8d0918c3; JSESSIONID=54020f0f-4f47-48b9-878a-e0ed8d0918c3";

        try {

            // 检查目标目录是否存在，如果不存在则创建它
            File directory = new File("/opt/uploadfiles/orderManage/");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            URL url = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // 设置 Cookie
            connection.setRequestProperty("Cookie", cookieHeader);

            // 发送请求
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = connection.getInputStream();
                OutputStream outputStream = new FileOutputStream(destinationFile);

                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                System.out.println("Image downloaded successfully.");

                inputStream.close();
                outputStream.close();
            } else {
                System.out.println("Failed to download image. Response code: " + responseCode);
            }

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package crelle.test.java.gson.date;

import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author:crelle
 * @className:TestBean
 * @version:1.0.0
 * @date:2020/7/29
 * @description:XX
 **/
public class TestBean {

    private Date date =  new java.util.Date(System.currentTimeMillis());

    private String site = "taishan_hotal";

    private int  num = 1327;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

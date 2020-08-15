package crelle.test.java.jackson;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author:crelle
 * @className:JacksonBean
 * @version:1.0.0
 * @date:2020/7/30
 * @description:XX
 **/
public class JacksonBean {
    public int id;
    public String name;
    @JsonFormat(shape = JsonFormat.Shape.SCALAR,pattern = "dd-MM-yyyy hh:mm:ss")
    public Date date;

    public JacksonBean(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }
}

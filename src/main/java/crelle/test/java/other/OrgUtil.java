package crelle.test.java.other;

import org.apache.commons.collections4.MapUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:crelle
 * @className:OrgUtil
 * @version:1.0.0
 * @date:2020/9/9
 * @description:XX
 **/
public class OrgUtil {
    private static Map<String,String> map;

    public static Map<String,String> getMap(){
        if(MapUtils.isEmpty(map)){
          map = new HashMap<String, String>();
          map.put("a","aaaa");
          map.put("b","bbbb");
        }
        return map;
    }
}

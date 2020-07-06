package jdkit.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openingo.jdkits.FastJsonKit;

/**
 * FastJsonKitDemo
 *
 * @author Qicz
 */
public class FastJsonKitDemo {

    public static void main(String[] args) {
        List<Map<String, Object>> hashMaps = FastJsonKit.toMapList("[{'name':'zcq', 'age':1},{'name':'zcq1', 'age':11, 'addr':'bj'}]");
        hashMaps.forEach(map -> {
            String age = map.get("age").toString();
            System.out.println(age.getClass() + "map" + map);
        });
        System.out.println(hashMaps);
    }
}
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1, "abc");
        map.put(3, "ccc");
        map.put(2, "abc");
        System.out.println(map);//{1=abc, 2=abc, 3=ccc}
        System.out.println(map.values());//[abc, abc, ccc]
        System.out.println(map.keySet());//[1, 2, 3]
        System.out.println(map.put(1, "abcd"));
        System.out.println(map);//{1=abcd, 2=abc, 3=ccc}
        System.out.println(map.isEmpty());//false
        System.out.println(map.containsKey(1));//true
        System.out.println(map.containsValue("a"));//false

        Map map1 = new HashMap<>(map);
        System.out.println(map1);
        System.out.println(map1.size());//3
        System.out.println(map1.remove(1));
        System.out.println(map1);
        System.out.println(map1.get(1));//null
        map1.put(null, "null");//
        System.out.println(map1);//{null=null, 2=abc, 3=ccc}
        map1.put(null, "null1");
        System.out.println(map1);//{null=null1, 2=abc, 3=ccc}
    }
}

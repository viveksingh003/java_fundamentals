import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {

        SortedMap sm = new TreeMap();
        sm.put(3, "Three");
        sm.put(1, "two");
        sm.put(6, "six");
        sm.put(5, "five");
        sm.put(2, "two");
        System.out.println(sm);//{1=two, 2=two, 3=Three, 5=five, 6=six}//sorted
        System.out.println(sm.firstKey());//1
        System.out.println(sm.lastKey());//6
        System.out.println(sm.tailMap(2));//{2=two, 3=Three, 5=five, 6=six}
        System.out.println(sm.headMap(2));//{1=two}
        System.out.println(sm.subMap(3, 6));//{3=Three, 5=five}
    }
}

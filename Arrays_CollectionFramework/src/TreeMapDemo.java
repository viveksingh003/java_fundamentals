import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap<>();
        System.out.println(tm);//{}

        SortedMap sm = new TreeMap();
        sm.put("a", 2);
        TreeMap tm1 = new TreeMap<>(sm);//{a=2}
        System.out.println(tm1);

        NavigableMap nm = new TreeMap();
        nm.put("a", 2);
        TreeMap tm3 = new TreeMap<>(nm);
        System.out.println(tm3);//{a=2}
        //tm.put(null,"h");//NullPointerException
        tm3.put(1, 2);
        System.out.println();//String cannot be cast to java.lang.Integer
        //ClassCastException

    }
}

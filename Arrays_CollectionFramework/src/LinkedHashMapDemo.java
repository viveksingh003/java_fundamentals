import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1, 'A');
        hm.put(2, "Ab");
        hm.put('a', 123);
        System.out.println(hm);//{1=A, a=123, 2=Ab}

        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(1, 'A');
        lhm.put(2, "Ab");
        lhm.put('a', 123);
        System.out.println(lhm);//{1=A, 2=Ab, a=123}

    }
}

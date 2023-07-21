import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        Integer i = 10;
        Integer j = 10;
        System.out.println(i == j);//t
        System.out.println(i.equals(j));//t
        Integer i1 = new Integer(10);
        Integer j2 = new Integer(10);
        System.out.println(i1 == j2);//f
        System.out.println(i1.equals(j2));//t

        HashMap hm = new HashMap();
        hm.put(i1, "a");
        hm.put(j2, 'b');
        System.out.println(hm);//{10=b}

        IdentityHashMap idm = new IdentityHashMap();
        idm.put(i1, "a");
        idm.put(j2, 'b');
        System.out.println(idm);//{10=b, 10=a}


    }
}

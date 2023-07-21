import java.util.HashMap;
import java.util.WeakHashMap;

public class Demo {


}

class WeakHashMapDemo1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        HashMap<Demo, String> hm = new HashMap<Demo, String>();
        hm.put(d, "hey");
        System.out.println(hm);//{Demo@1540e19d=hey}
        d = null;
        System.gc();
        System.out.println(hm);//{Demo@1540e19d=hey}

        Demo d1 = new Demo();
        WeakHashMap<Demo, String> whm = new WeakHashMap<Demo, String>();
        whm.put(d1, "hey");
        System.out.println(whm);//{Demo@677327b6=hey}
        d1 = null;
        System.gc();

        System.out.println(whm);//


    }
}

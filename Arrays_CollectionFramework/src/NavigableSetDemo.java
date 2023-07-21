import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {


        NavigableSet ns = new TreeSet();
        ns.add(1);
        ns.add(0);
        ns.add(3);
        ns.add(2);
        ns.add(5);

        System.out.println(ns);//[0, 1, 2, 3, 5]
        System.out.println(ns.descendingSet());//5, 3, 2, 1, 0]
        System.out.println(ns.ceiling(3));//3
        System.out.println(ns.floor(2));//2
        System.out.println(ns.higher(2));//3--just
        System.out.println(ns.lower(2));//1
        System.out.println(ns.pollFirst());//0
        System.out.println(ns);//[1, 2, 3, 5]
        System.out.println(ns.pollLast());//5
        System.out.println(ns);//[1, 2, 3]
    }
}

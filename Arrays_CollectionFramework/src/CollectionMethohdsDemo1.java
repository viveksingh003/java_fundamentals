import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionMethohdsDemo1 {

    public static void main(String[] args) {


        ArrayList arr = new ArrayList();
        arr.add("abc");
        arr.add(1);
        arr.add('a');
        System.out.println(arr);//[abc, 1, a]

        LinkedList l = new LinkedList<>();
        l.add("hi");
        l.add("hello");
        l.add(2);
        System.out.println(l);//[hi, hello, 2]
        System.out.println(l.addAll(arr));//true
        System.out.println(l);//[hi, hello, 2, abc, 1, a]

        //remove
        l.remove("hi");
        System.out.println(l);
        l.removeAll(arr);
        System.out.println(l);//[hello, 2],[removeAll[l]]

    }

}

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {

        SortedSet s = new TreeSet();
        s.add(10);
        s.add(2);
        s.add(3);
        //s.add("a");//ClassCastException
        System.out.println(s);//[2, 3, 10] -- Sorted
        System.out.println(s.first());//first element after sort -2
        System.out.println(s.last());//last element after sort -- 10

        System.out.println(s.headSet(3));//[2] //to
        System.out.println(s.tailSet(2));//[2, 3, 10] //from
        System.out.println(s.subSet(2, 10));//[2, 3]

    }
}

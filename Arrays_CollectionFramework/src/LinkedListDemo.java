import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();//const
        System.out.println(linkedList);

        Set set = new HashSet();
        set.add(1);
        LinkedList linkedList1 = new LinkedList(set);//const
        System.out.println(linkedList1);
        System.out.println(set);

        //methods
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(1);
        linkedList2.add(2);
        System.out.println(linkedList2);
        linkedList2.addFirst("first");
        System.out.println(linkedList2);
        linkedList2.addLast("last");
        System.out.println(linkedList2);
        System.out.println(linkedList2.getFirst());
        System.out.println(linkedList2.getLast());
        linkedList2.removeFirst();
        linkedList2.removeLast();
        System.out.println(linkedList2);


    }
}

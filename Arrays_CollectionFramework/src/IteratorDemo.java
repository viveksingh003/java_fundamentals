import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        Iterator i = al.iterator();
        System.out.println(i);

        while (i.hasNext()) {

            Object o = i.next();
            System.out.println(o);

            if (o.equals(1)) {
                // System.out.println("in");
                i.remove();
            }


        }
        System.out.println(al);

    }
}

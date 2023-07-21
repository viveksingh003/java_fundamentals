import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {

        List l = new ArrayList<>();
        l.add('v');
        l.add('i');
        l.add('v');
        l.add('e');
        l.add('k');
        System.out.println(l);
        ListIterator lt = l.listIterator();
        while (lt.hasNext()) {
            System.out.println(lt.nextIndex() + " " + lt.next());//forward dir
        }

        System.out.println();
        while (lt.hasPrevious()) {
            System.out.println(lt.previousIndex() + " " + lt.previous());//bkwrd dir
        }

        while (lt.hasNext()) {

            char ch = (char) lt.next();
            if (ch == 'v') {
                lt.add('s');

            }
            if (ch == 'k') {
                lt.set('s');
            }
            if (ch == 'i') {
                lt.remove();
            }

        }
        System.out.println(l);


    }
}

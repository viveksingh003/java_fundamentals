import java.util.ArrayList;
import java.util.List;

public class ListMethodsDemo {

    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);//[1, 2, 3]
        l.add(3, 4);
        System.out.println(l);//[1, 2, 3, 4]
        //  l.add(5,5);//java.lang.IndexOutOfBoundsException

        //--------//
        l.set(0, 0);
        System.out.println(l);//[0, 2, 3, 4]
        //l.set(4,5);//java.lang.IndexOutOfBoundsException


    }


}

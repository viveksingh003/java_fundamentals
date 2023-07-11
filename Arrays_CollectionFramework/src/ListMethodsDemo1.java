import java.util.ArrayList;
import java.util.List;

public class ListMethodsDemo1 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);

        System.out.println(l.get(0));//1
        //System.out.println(l.get(3));//java.lang.IndexOutOfBoundsException
        System.out.println(l.remove(0));//1
        System.out.println(l);//[2, 3]
        l.add(3);
        l.add(4);
        l.add(3);
        System.out.println(l);//[2, 3, 3, 4, 3]
        System.out.println(l.indexOf(3));//1
        System.out.println(l.lastIndexOf(3));//4
        //***
        System.out.println(l.lastIndexOf(9));//-1

    }
}

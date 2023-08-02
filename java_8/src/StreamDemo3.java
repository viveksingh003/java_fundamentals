import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo3 {

    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();

        al.add("AAA");
        al.add("DDD");
        al.add("EEE");
        al.add("CCC");
        al.add("FFF");
        al.add("BBB");

        System.out.println(al);


        List<String> list = al.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
        Comparator<String> c = (n, n1) -> -n.compareTo(n1);
        List<String> list1 = Collections.singletonList(al.stream().min(c).get());
        System.out.println(list1);
        System.out.println(al.stream().max(c).get());
        System.out.println(al.stream().count());

        /*
        [AAA, DDD, EEE, CCC, FFF, BBB]
        [AAA, BBB, CCC, DDD, EEE, FFF]
        [FFF]
        AAA
        6
         */


    }
}

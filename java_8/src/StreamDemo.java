import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println(al);

/*        Stream<Integer> stream=al.stream();
        System.out.println(stream);
        Predicate<Integer> p=n->n%2==0;

        Stream stream1=stream.filter(p);
        System.out.println(stream1);
        List<Integer>list= (List<Integer>) stream1.collect(Collectors.toList());
        System.out.println(list);*/

        List<Integer> list=al.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(list);
    }
}

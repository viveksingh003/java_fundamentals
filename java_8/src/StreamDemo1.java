import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=20;i++){
            al.add(i);
        }
        System.out.println(al);

        Stream<Integer> stream=al.stream();
        Function<Integer,Integer> function=n->n*n;
        Stream<Integer> stream1=stream.map(function);
        ArrayList<Integer>list= (ArrayList<Integer>) stream1.collect(Collectors.toList());
        System.out.println(list);

        List<Integer> list1=al.stream().map(n->n+11).collect(Collectors.toList());
        System.out.println(list1);

    }
}

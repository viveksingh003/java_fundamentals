import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamApproachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            al.add(i);

        }
        System.out.println(al);


        List<Integer> al1 = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(al1);

    }
}

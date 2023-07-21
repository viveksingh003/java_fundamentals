import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(3);
        lhs.add("a");
        System.out.println(lhs);//[1, 3, a] follows insertion order

    }

}

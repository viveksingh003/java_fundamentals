import java.util.function.Predicate;

public class PredicateDemo2 {
    int a;

    public static void main(String[] args) {

        Predicate<Integer> p = n -> n % 2 == 0;
        Predicate<Integer> p1 = n -> n < 50;
        Predicate<Integer> p2 = p.and(p1);//t

        System.out.println(p2);

        Predicate<Integer> p3 = p.or(p1);
        System.out.println(p3);//f

        Predicate<Integer> p4 = p.negate();
        System.out.println(p4);


    }
}

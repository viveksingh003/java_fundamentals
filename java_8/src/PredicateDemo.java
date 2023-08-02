import java.util.function.Predicate;

//predicate to check whether the given integer is greater than 10 or not.
public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> p = n -> n > 10;
        System.out.println(p.test(12));//t

        System.out.println(p.test(1));//f


    }
}

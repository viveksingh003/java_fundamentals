import java.util.function.Function;

public class FuctionsDemo {

    public static void main(String[] args) {

        Function<Integer, Integer> f = f1 -> f1 * f1;
        System.out.println(f.apply(2));
        System.out.println(f.apply(9));

        Function<String, String> fxn = f2 -> "Hello " + f2 + "!";
        System.out.println(fxn.apply("vivek"));
    }
}

/*
4
81
Hello vivek!
 */

import java.util.StringTokenizer;

public class StringtokenizerDemo {
    public static void main(String[] args) {


        StringTokenizer st = new StringTokenizer("Vivek Singh");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());

        }



        StringTokenizer st1 = new StringTokenizer("Vivek.Singh");

        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken("."));

        }
        StringTokenizer st3=new StringTokenizer("Vivek singh","e");
        while (st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }

    }
}

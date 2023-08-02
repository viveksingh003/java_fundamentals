import java.util.ArrayList;

public class WithoutStreamApproachDemo {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            al.add(i);

        }
        System.out.println(al);

        ArrayList<Integer> al1 = new ArrayList<>();
        for (Integer a : al) {
            if (a % 2 == 0) {
                al1.add(a);
            }
        }
        System.out.println(al1);

    }
}

import java.util.Date;

public class MultiCatchBlockDemo {

    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        java.util.Date d = null;
        int arr[] = new int[]{1, 2};
        Date dt = new Date("29/09/1988");
        try {

            int k = i / j;
            System.out.println(k);
            //System.out.println(d.toString());
            //System.out.println(arr[8]);
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            int k = i / 1;
            System.out.println(k);
            //d=dt;
            // System.out.println(dt);
            //System.out.println(arr[0]);


        }

    }


}

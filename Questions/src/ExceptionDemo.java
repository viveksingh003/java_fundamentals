import java.util.Scanner;

public class ExceptionDemo {
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();

    static int b = sc.nextInt();

    static void m1() {


        try {
            System.out.println(a / b);

        } catch (Exception e) {

          //  System.out.println(a / 1);

        } finally {
            sc.close();
            System.out.println("finally");
        }


    }

    public static void main(String[] args) {

        m1();

        System.out.println(a / b);

        System.out.println("End of programme");


    }

}

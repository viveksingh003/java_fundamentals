import java.util.Scanner;

//Write a Java program to find the common elements between two arrays of integers using nested loops.
public class Q6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;

        System.out.print(first + " ");
        System.out.print(second + " ");

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;


        }

    }
}
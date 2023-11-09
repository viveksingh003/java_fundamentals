
/*
Write a Java program that takes an integer as input and checks if it is a prime number or not using a for loop.
 */

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int a = sc.nextInt();//6

        if (a <= 1) {//6<=1
            System.out.println(a + " is not a prime number");
        } else if (a > 1) {
            for (int i = 2; i < Math.sqrt(a); i++) {

                if (a % i == 0) {
                    count = count + 1;

                }

            }
        }

        if (count >= 1) {
            System.out.println(a + " is Not Prime");
        } else {
            System.out.println(a + " is  Prime");
        }
        System.out.println(Math.sqrt(6));
        System.out.println(Math.sqrt(8) % 2 == 0);

    }
}


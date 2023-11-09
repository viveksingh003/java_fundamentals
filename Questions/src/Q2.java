import java.util.Scanner;

//Write a Java program that calculates and prints the factorial of a given number.
// The program should take an integer as input and display its factorial.
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int mul=1;


        for(int j=i;j>=1;j--){
            mul=mul*j;
        }
        System.out.println("Factorial = " +mul);

    }
}

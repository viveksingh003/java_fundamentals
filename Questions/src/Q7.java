
//Write a Java program that generates and prints the first N Fibonacci numbers.
// Fibonacci numbers are a series of numbers where each number is the sum of the two preceding ones, starting from 0 and 1.

import java.util.Scanner;

/*
 The sequence starts with 0 and 1, and each subsequent number is the sum of the previous two.
 */
public class Q7 {

        public static void main(String[] args) {
                int a[]={1,2,3,4,10,41};
                int b[]={1,2,3,4,5,6,4};

                for(int i=0;i<a.length;i++){

                        for (int j=0;j<b.length;j++){
                                if(a[i]==b[j])
                                System.out.print(a[i]+" ");


                        }
                }
        }


        }









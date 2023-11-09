import java.util.Scanner;

//Write a Java program to check if a given string is a palindrome or not.
// A palindrome is a string that reads the same backward as forward.
public class Q5 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        boolean isPalindrome=true;



        char ch[]=str.toCharArray();
        for (int i=0;i<ch.length;i++){

            if(ch[0]==ch[ch.length-1]& i<ch.length ){

            //    System.out.println("before "+isPalindrome);
             isPalindrome=ch[i]==ch[ch.length-i-1];

               // System.out.println("after "+isPalindrome);
            }
            else {
                isPalindrome=false;
            }


        }

        System.out.println(isPalindrome);






    }
}


import java.util.Scanner;

//Write a Java program that takes a string as input and counts the number of vowels (a, e, i, o, u) in it.
public class Q4 {

    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' | arr[i]=='e'|arr[i]=='i'|arr[i]=='o'| arr[i]=='u')
                count+=1;


        }
        System.out.println("No of vowels in String "+str +" are "+count);

    }
}

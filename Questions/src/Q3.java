
//Write a Java program to find the sum of all elements in an array of integers.

public class Q3 {

    public static void main(String[] args) {

        int sum=0;

        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        System.out.println(sum);
    }
}

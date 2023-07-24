import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        System.out.println("Enter text");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        for (char c : ch) {
            System.out.println(c + " ");
        }
        System.out.println("Enter text again");
        String str1 = sc.next();
        System.out.println(str1);
        System.out.println("Enter 1st number to add");
        System.out.println("Enter 2nd number to add");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);


    }
}

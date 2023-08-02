import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {

        Pattern p = Pattern.compile(" ");
        String s[] = p.split("vivek singh");


        for (String s1 : s) {
            System.out.println(s1);
        }

        Pattern p1 = Pattern.compile("\\.");

        String str[] = p1.split("viveksingh.pat5@gmail.com");


        for (String s2 : str) {
            System.out.println(s2);
        }

        Pattern p2 = Pattern.compile("[^a-zA-Z0-9]");

        String str1[] = p2.split("viveksingh.pat5@gmail.com");


        for (String s3 : str1) {
            System.out.println(s3);
        }

        /*
vivek
singh
viveksingh
pat5@gmail
com
viveksingh
pat5
gmail
com
         */

    }
}
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFirstNum {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("[6-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
        Matcher m = p.matcher("9263108874");
        while (m.find()) {
            System.out.println(m.group());
        }

        Pattern p1 = Pattern.compile("[6-9][0-9]{9}");
        Matcher m1 = p1.matcher("9263108874");
        while (m1.find()) {
            System.out.println(m1.group());
        }

        Pattern p2 = Pattern.compile("[a-zA-Z0-9.]+@icloud.com");
        Matcher m2 = p2.matcher("ab.c@icloud.com");
        while (m2.find()) {
            System.out.println(m2.group());
        }

    }
}

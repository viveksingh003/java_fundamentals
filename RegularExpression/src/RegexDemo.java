import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("aa");
        Matcher m = p.matcher("aaweraatyaattaattaayyauiaa");
        int count = 0;
        while (m.find()) {
            System.out.println("start " + m.start() + " end " + ((m.end()) - 1) + " group " + m.group());
            count = count + 1;
        }
        System.out.println("No of occurence " + count);
    }
}
/*
start 0 end 1 group aa
start 5 end 6 group aa
start 9 end 10 group aa
start 13 end 14 group aa
start 17 end 18 group aa
start 24 end 25 group aa
No of occurence 6
 */
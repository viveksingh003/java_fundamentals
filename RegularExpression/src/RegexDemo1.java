import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[abc]");
        Matcher m=p.matcher("abcdefa");
        while (m.find()){
            System.out.println(m.start()+" "+m.group());
        }

        Pattern p1=Pattern.compile("[\\s]");
        Matcher m1=p1.matcher("vi vek");
        while (m1.find()){
            System.out.println(m1.start()+" "+m1.group());
        }

        Pattern p2=Pattern.compile("[\\w]");
        Matcher m2=p2.matcher("vivek");
        while (m2.find()){
            System.out.println(m2.start()+" "+m2.group());
        }
        Pattern p3=Pattern.compile(".");
        Matcher m3=p3.matcher("vivek&*");
        while (m3.find()){
            System.out.println(m3.start()+" "+m3.group());
        }

    }
}
/*
0 a
1 b
2 c
6 a
2
0 v
1 i
2 v
3 e
4 k
0 v
1 i
2 v
3 e
4 k
5 &
6 *
 */
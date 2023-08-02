import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {

        Pattern p=Pattern.compile("a*");
        Matcher m=p.matcher("ababababababa");

        while (m.find()){
            System.out.println(m.start()+" "+m.group());
        }

    }
}
/*
0 a
1
2 a
3
4 a
5
6 a
7
8 a
9
10 a
11
12 a
13
 */
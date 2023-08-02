import java.util.StringTokenizer;

public class StringTokenizerRegexDemo {
    public static void main(String[] args) {

        StringTokenizer str=new StringTokenizer("viveksingh.pat5@gmail.com",".");
        while (str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
    }
}

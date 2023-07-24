import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileReadOperationNoOfWords {
    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("/Users/vivek/test.txt");
        int size = fis.available();
        int count1 = 0;
        int count = 0;
        byte b[] = new byte[size];
        fis.read(b);
        String data = new String(b);
        System.out.println(data);

        String[] tokens = data.split(" ");
        System.out.println("no of words " + tokens.length);
        for (String token : tokens) {
            if (token.equals("vivek"))
                count1 = count1 + 1;


        }
        System.out.println(count1);


        StringTokenizer str = new StringTokenizer(data);
        while (str.hasMoreTokens()) {
            if (str.nextToken().equals("vivek")) {
                count = count + 1;
            }
            //System.out.println(str.nextToken());
        }

        System.out.println(count);

    }
}

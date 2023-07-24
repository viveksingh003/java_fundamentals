import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicinputBufferedReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String name = br.readLine();
        System.out.println(name);
        System.out.println("Enter your name Again");
        int val = br.read();//ascii
        System.out.println("read() " + (char) val);


    }
}

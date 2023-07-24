import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/vivek/test.txt");
        String str = "";
        int val = fr.read();//ascii value gets return
        while (val != -1) {
            str = str + (char) val;
            val = fr.read();

        }
        System.out.println(str);
        fr.close();
    }

}

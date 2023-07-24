import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/vivek/test3.txt",false);
        String str = "hello";
        char[] ch = str.toCharArray();
        fw.write(ch);
        fw.close();

    }
}

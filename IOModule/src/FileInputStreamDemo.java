import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("/Users/vivek/test.txt");
        int size = fis.available();
        byte[] b = new byte[size];
        fis.read(b);
        String data = new String(b);
        System.out.println(data);
        fis.close();

    }
}

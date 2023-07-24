import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String name = "vivek";
        String name1 = "singh";
        //byte oriented stream
        FileOutputStream fos = new FileOutputStream("/Users/vivek/test.txt");//override
        byte b[] = name.getBytes();
        fos.write(b);
        fos.close();
        FileOutputStream fos1 = new FileOutputStream("/Users/vivek/test.txt", true);//don't override
        byte b1[] = name1.getBytes();
        fos1.write(b1);
        fos1.close();
    }
}

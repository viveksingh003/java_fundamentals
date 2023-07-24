import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/Users/vivek/test1.txt");
            String data = "Hello Coders";
            byte[] b = data.getBytes();
            fos.write(b);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}

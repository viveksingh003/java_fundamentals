import java.io.FileOutputStream;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) {
        //try wirth resources option   --- JVM will provide close method once try task done
        //Autoclose of the resource
        try (FileOutputStream fos = new FileOutputStream("/Users/vivek/test12txt", false)) {
            String name = "vivek";
            byte b[] = name.getBytes();
            fos.write(b);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

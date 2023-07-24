import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPasteDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/vivek/test.txt");
        String str = "";
        int val = fr.read();
        while (val != -1) {
            str = str + (char) val;
            val = fr.read();
        }
        System.out.println(str);

        FileWriter fw = new FileWriter("/Users/vivek/testDemo.txt");
        String str1 = str;
        char chr[] = str1.toCharArray();
        fw.write(chr);
        fw.close();


    }

}

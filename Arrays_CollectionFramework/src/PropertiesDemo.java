import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/vivek/desktop/java/db.properties");
        Properties p = new Properties();
        p.setProperty("driverClass", "oracle.jdbc.OracleDriver");
        p.setProperty("driverURL", "jdbc:oracle:thin:@myoracle.db.server:1521:my_sid");
        p.setProperty("username", "vivek");
        p.setProperty("passwrod", "code");

        p.store(fos, "Db details");

        FileInputStream fis=new FileInputStream("/Users/vivek/desktop/java/db.properties");
                Properties p1=new Properties();
                p1.load(fis);
        System.out.println(p.getProperty("username"));//vivek

    }
}

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class CatchOrderDemo2 {
    static void m1() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        m1();

    }
}
//bottom to up -- parent hierarchy
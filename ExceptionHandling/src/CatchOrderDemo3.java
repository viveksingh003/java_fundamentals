import java.io.IOException;

public class CatchOrderDemo3 {

    static void m1() {
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {

        }

        //catch (IoException e){
        //
        //       }
        //if we specify any pure checked exception along with any catch block then the
        //corresponding "try" block must rise the same pure checked exception
        catch (Exception e) {

        }


    }

    public static void main(String[] args) {
        m1();

    }

}

import java.time.DayOfWeek;
import java.time.Month;
import java.time.Year;

public class LeapYearDemo {
    public static void main(String[] args) {

        Year y = Year.of(2000);
        System.out.println(y.isLeap());

        Month m = Month.of(3);
        System.out.println(m);


    }
}

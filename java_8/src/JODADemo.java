import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class JODADemo {

    public static void main(String[] args) {
        LocalDate current_Date = LocalDate.now();
        System.out.println(current_Date);

        int day = current_Date.getDayOfMonth();// date
        System.out.println();
        int year = current_Date.getDayOfYear();//213 -- days in year lapsed
        System.out.println(day);
        System.out.println(year);
        int day1 = current_Date.getMonthValue();
        System.out.println(day1);//8

        LocalDate p_date = LocalDate.of(1994, 05, 03);
        System.out.println(p_date);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        int hr = localTime.getHour();
        System.out.println(hr);
        long ns = localTime.getNano();
        System.out.println(ns);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        int second = dt.getSecond();
        System.out.println(second);


        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1996, 05, 03);
        Period p = Period.between(birthday, today);
        System.out.println(p);

        System.out.println(p.getYears());


    }

}

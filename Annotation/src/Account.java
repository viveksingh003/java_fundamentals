import java.lang.annotation.*;
import java.lang.reflect.Method;

@Inherited
@Target(ElementType.TYPE)//TYPE for class
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface Bank {
    String name() default "HDFC Bank";

    String branch() default "Patna";

    String phone() default "010-123456";


}

@Bank(name = "ICICI Bank", phone = "040-987654", branch = "patna")
public class Account {

    int accNo;
    String name;

    Account(int accNo, String name) {
        this.accNo = accNo;
        this.name = name;

    }

    void getAccDetails() {
        System.out.println("Acc no -:" + accNo + " Name -:" + name);
    }

}


class App {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Account a = new Account(123, "abc");
        a.getAccDetails();

        Class c = Class.forName("Account");
        Annotation an = c.getAnnotation(Account.class);
        Bank b = (Bank) an;
        System.out.println("Bank details " + b.branch() + "  " + b.name() + " " + b.phone());
        //Method m=c.getMethod("getAccDetails");
        //Annotation ann = m.getAnnotation(Bank.class);
        //Bank b1=(Bank)ann;


    }
}
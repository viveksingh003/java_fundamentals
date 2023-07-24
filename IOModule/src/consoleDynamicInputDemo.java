import java.io.Console;

public class consoleDynamicInputDemo {
    public static void main(String[] args) {

        Console cs = System.console();
        String uName = cs.readLine("Enter Username ");
        char uPwd[] = cs.readPassword("Enter  pswd");

        String upwd = new String(uPwd);
        if (uName.equals("vivek") && upwd.equals("pswd")) {
            System.out.println("Login  Success");

        } else
            System.out.println("Login  Invalid");

    }

}

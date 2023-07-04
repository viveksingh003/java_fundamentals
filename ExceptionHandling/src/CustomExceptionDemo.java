public class CustomExceptionDemo {

    static void m1() {
        try {
            if (2 == 2) {
                throw new UserDefinedException("My Exception");
            } else {
                System.out.println("no exeption");
            }
        } catch (Exception u) {
            System.out.println("My Exception called");
        }

    }

    public static void main(String[] args) {
        m1();
    }

}

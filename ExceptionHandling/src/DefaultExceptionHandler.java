public class DefaultExceptionHandler extends Exception {

    public static void main(String[] args) {

        m1();
        System.out.println("main method gets called");

    }

    private static void m1() {
        //m2();
        System.out.println("m1 method gets called");
    }

    private static void m2() {
        System.out.println(10/0);
    }
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at DefaultExceptionHandler.m2(DefaultExceptionHandler.java:16)
	at DefaultExceptionHandler.m1(DefaultExceptionHandler.java:11)
	at DefaultExceptionHandler.main(DefaultExceptionHandler.java:5)
 */
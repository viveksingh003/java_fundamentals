public class NumberFormatExceptionDemo {
    public static void main(String[] args) {

        String a="10";

        int i =Integer.parseInt(a);
        System.out.println(i);
        String abc="abc";

        int j =Integer.parseInt(abc);
        System.out.println(abc);

    }
}
/*
10
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 */

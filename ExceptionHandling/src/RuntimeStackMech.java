public class RuntimeStackMech {
    public static void main(String[] args) {

        m1();
        System.out.println("main method gets called");

    }

    private static void m1() {
        m2();
        System.out.println("m1 method gets called");
    }

    private static void m2() {
        System.out.println("m2 methods get called");
    }
}

/*
m2 methods get called
m1 method gets called
main method gets called
 */
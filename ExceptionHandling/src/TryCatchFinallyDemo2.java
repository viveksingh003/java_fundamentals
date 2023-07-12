public class TryCatchFinallyDemo2 {

    int m1() {
        m2();
        return 1;

    }

    int m2() {
        try {
            System.out.println("try block");
            return 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 2;
        } finally {
            System.out.println("finally block");
            return 10;
        }

    }

    public static void main(String[] args) {
        TryCatchFinallyDemo2 demo = new TryCatchFinallyDemo2();
        demo.m1();
        int val = demo.m1();
        System.out.println(val);
        int val1 = demo.m2();
        System.out.println(val1);


    }
}
/*
try block
finally block
1
try block
finally block
10
 */
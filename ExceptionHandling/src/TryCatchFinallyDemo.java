import java.io.IOException;

public class TryCatchFinallyDemo {

    public static void main(String[] args) {
        System.out.println("before try");
        try {
            System.out.println("inside try ");
        } catch (Exception e) {
            System.out.println("e ref var " + e);
            System.out.println("______");
            System.out.println("e.getMessage " + e.getMessage());
            System.out.println("_______");
            System.out.println("e.printStackTrace()");
            e.printStackTrace();

        } finally {
            System.out.println("Inside finally block");
        }

    }
}

/*
before try
inside try
Inside finally block
 */

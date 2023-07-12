import java.io.IOException;

public class ThrowsKeywordDemo {

    void m1() throws Exception {
        m2();
    }

    void m2() throws Exception {
        throw new IOException("IO Exception");

        //java: unreported exception java.io.IOException;
        // must be caught or declared to be thrown
    }


    public static void main(String[] args) throws Exception {
        ThrowsKeywordDemo demo = new ThrowsKeywordDemo();
        demo.m1();

    }
}
/*
Exception in thread "main" java.io.IOException: IO Exception
	at ThrowsKeywordDemo.m2(ThrowsKeywordDemo.java:10)
	at ThrowsKeywordDemo.m1(ThrowsKeywordDemo.java:6)
	at ThrowsKeywordDemo.main(ThrowsKeywordDemo.java:19)
 */

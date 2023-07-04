public class ThrowKeywordDemo1 {

    int acc_no;
    int pin;

    ThrowKeywordDemo1(int accNo, int pin) {
        this.acc_no = accNo;
        this.pin = pin;

    }

    void checkValidPin() {
        if (pin == 1234) {
            System.out.println("Valid pin");
        } else {
            throw new RuntimeException("Invalid Pin");
        }
    }

    public static void main(String[] args) {
        ThrowKeywordDemo1 demo1 = new ThrowKeywordDemo1(947123, 1234);
        demo1.checkValidPin();//Valid pin
        ThrowKeywordDemo1 demo = new ThrowKeywordDemo1(947123, 0000);
        //  demo.checkValidPin();//Exception in thread "main" java.lang.RuntimeException: Invalid Pin
    }


}

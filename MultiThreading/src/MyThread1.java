public class MyThread1 extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }

    }

}

class MainApp {
    public static void main(String[] args) {


        MyThread1 myThread1 = new MyThread1();
        myThread1.start();///start method will call run() method internally

    }
}
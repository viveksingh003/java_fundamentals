public class MyThread2 extends Thread {

    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Hello");
        }

    }

}

class MainApp1 {
    public static void main(String[] args) {

        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Hey");
        }

    }

}
/*
Hey
Hey
Hey
Hey
Hey
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hey
Hey
Hey
Hey
Hey

 */
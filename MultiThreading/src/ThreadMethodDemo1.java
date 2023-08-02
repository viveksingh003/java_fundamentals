public class ThreadMethodDemo1 extends Thread {

    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName());

        }
    }

    public static void main(String[] args) {

        ThreadMethodDemo1 t1 = new ThreadMethodDemo1();
        t1.start();
        ThreadMethodDemo1 t2 = new ThreadMethodDemo1();
        t2.start();
        ThreadMethodDemo1 t3 = new ThreadMethodDemo1();
        t3.start();
        t1.setName("Thread_A");
        t2.setName("Thread_B");
        t1.setName("Thread_C");


    }
}

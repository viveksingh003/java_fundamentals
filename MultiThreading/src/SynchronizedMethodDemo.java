
//without using synchronized method
//and
//with using synchronized method
public class SynchronizedMethodDemo {

    public synchronized void  m1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + Thread.currentThread().getName());
        }
    }
/*
    public  void  m1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + Thread.currentThread().getName());
        }
    }
*/
}

class SynchronizedMethodDemo1 extends Thread  {

    SynchronizedMethodDemo synchronizedMethodDemo;
    SynchronizedMethodDemo1(SynchronizedMethodDemo synchronizedMethodDemo){
        this.synchronizedMethodDemo=synchronizedMethodDemo;
    }

    public void run() {
        synchronizedMethodDemo.m1();
    }

}

class SynchronizedMethodDemo2 extends Thread  {
    SynchronizedMethodDemo synchronizedMethodDemo;
    SynchronizedMethodDemo2(SynchronizedMethodDemo synchronizedMethodDemo){
        this.synchronizedMethodDemo=synchronizedMethodDemo;
    }

    public void run() {
        synchronizedMethodDemo.m1();
    }
}

class SynchronizedMethodDemo3 extends Thread {
    SynchronizedMethodDemo synchronizedMethodDemo;
    SynchronizedMethodDemo3(SynchronizedMethodDemo synchronizedMethodDemo){
        this.synchronizedMethodDemo=synchronizedMethodDemo;
    }

    public void run() {
        synchronizedMethodDemo.m1();
    }
}

class Test {
    public static void main(String[] args) {

        SynchronizedMethodDemo sd=new SynchronizedMethodDemo();
        SynchronizedMethodDemo1 sd1 = new SynchronizedMethodDemo1(sd);
        SynchronizedMethodDemo2 sd2 = new SynchronizedMethodDemo2(sd);
        SynchronizedMethodDemo3 sd3= new SynchronizedMethodDemo3(sd);
        sd1.setName("sd1 thread");
        sd1.start();

        sd2.setName("sd2 thread");
        sd2.start();

        sd3.setName("sd3 thread");
        sd3.start();
    }
}
/*
Hello sd1 thread
Hello sd3 thread
Hello sd3 thread
Hello sd2 thread
Hello sd2 thread
Hello sd2 thread
Hello sd2 thread
Hello sd2 thread
Hello sd3 thread
Hello sd3 thread
Hello sd3 thread
Hello sd1 thread
Hello sd1 thread
Hello sd1 thread
Hello sd1 thread

 */

/*
Hello sd1 thread
Hello sd1 thread
Hello sd1 thread
Hello sd1 thread
Hello sd1 thread
Hello sd3 thread
Hello sd3 thread
Hello sd3 thread
Hello sd3 thread
Hello sd3 thread
Hello sd2 thread
Hello sd2 thread
Hello sd2 thread
Hello sd2 thread
Hello sd2 thread

 */
public class SynchronizedBlockDemo {


    public void m1() {


        System.out.println("Outside sync block" + Thread.currentThread().getName());

        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Inside sync block" + Thread.currentThread().getName());
            }
        }

    }
}

class B extends Thread {
    SynchronizedBlockDemo synchronizedBlockDemo;

    B(SynchronizedBlockDemo synchronizedBlockDemo) {
        this.synchronizedBlockDemo = synchronizedBlockDemo;

    }

    public void run() {
        synchronizedBlockDemo.m1();


    }

}

class C extends Thread {
    SynchronizedBlockDemo synchronizedBlockDemo;

    C(SynchronizedBlockDemo synchronizedBlockDemo) {
        this.synchronizedBlockDemo = synchronizedBlockDemo;

    }

    public void run() {
        synchronizedBlockDemo.m1();


    }

}

class D extends Thread {
    SynchronizedBlockDemo synchronizedBlockDemo;

    D(SynchronizedBlockDemo synchronizedBlockDemo) {
        this.synchronizedBlockDemo = synchronizedBlockDemo;

    }

    public void run() {
        synchronizedBlockDemo.m1();


    }

}

class Main1 {
    public static void main(String[] args) {


        SynchronizedBlockDemo synchronizedBlockDemo1 = new SynchronizedBlockDemo();
        B b = new B(synchronizedBlockDemo1);
        C c = new C(synchronizedBlockDemo1);
        D d = new D(synchronizedBlockDemo1);

        b.setName("Thread B");
        c.setName("Thread C");
        d.setName("Thread D");
        b.start();
        c.start();
        d.start();


    }
}

/*
Outside sync blockThread B
Inside sync blockThread B
Inside sync blockThread B
Inside sync blockThread B
Inside sync blockThread B
Inside sync blockThread B
Outside sync blockThread D
Inside sync blockThread D
Inside sync blockThread D
Inside sync blockThread D
Inside sync blockThread D
Inside sync blockThread D
Outside sync blockThread C
Inside sync blockThread C
Inside sync blockThread C
Inside sync blockThread C
Inside sync blockThread C
Inside sync blockThread C
 */

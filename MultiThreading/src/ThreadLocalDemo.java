public class ThreadLocalDemo extends ThreadLocal {
    public String initialValue() {
        return "default value";
    }

}

class C1 {
    public void m1() {
        System.out.println("m1 method" + Thread.currentThread());
    }

    public void m2() {
        System.out.println("m1 method" + Thread.currentThread());
        System.out.println(A1.ts.get());
    }
}


class A1 extends Thread {

    static ThreadLocalDemo ts = new ThreadLocalDemo();

    C1 c;

    A1(C1 c) {
        this.c = c;


    }

    public void run() {
        ts.set("Hey");
        c.m2();

    }


}

class B1 extends Thread {


    C1 c;

    B1(C1 c) {
        this.c = c;


    }

    public void run() {
        c.m2();

    }

}

class App4 {
    public static void main(String[] args) {


        C1 c = new C1();
        A1 a = new A1(c);
        B1 b = new B1(c);

        a.setName("Thread A1");
        b.setName("Thread B1");

        a.start();
        b.start();
    }

}

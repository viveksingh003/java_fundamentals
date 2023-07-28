

class A {
    int a;

    class B extends A {
        int b;

    }

    class C extends B {
        int c;

    }


    interface I {
        void m1();

        void m2();
    }


    class D implements I {

        @Override
        public void m1() {

        }

        @Override
        public void m2() {

        }
    }

    abstract class E {
        void m3() {

        }

        ;

        abstract void m4();

    }

    class F extends E {

        @Override
        void m4() {

        }

        void m5() {
        }

        ;
    }

}

public class InnerClassDemo2 {
    static int a;
    public static void main(String[] args) {


        A a = new A();
        A.C ab = new A().new C();
        System.out.println(ab.a);
        System.out.println(ab.b);
        System.out.println(ab.c);

        A.B abc = new A().new C();
        System.out.println(abc.a);
        System.out.println(abc.b);
        //System.out.println(abc.c);//error


        A.I ad = new A().new D();
        ad.m1();
        ad.m2();

        A.E ae = new A().new F();
        ae.m3();
        ae.m4();
        // ae.m5();//error


    }

}

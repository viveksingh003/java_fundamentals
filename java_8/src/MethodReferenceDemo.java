
interface I {

    void m1();

}


interface I1 {
    void m2(int i);
}

interface I2 {
    void m3(String str);
}

interface I3 {
    void m3();
}


class MethodReferenceDemo {

    static void method4() {
        System.out.println("static method");
    }

    MethodReferenceDemo() {

    }

    MethodReferenceDemo(String str) {
        System.out.println("Hi " + str);
    }

    void method1() {
        System.out.println("Method reference");
    }

    void method2(int j) {
        System.out.println("Method reference with param " + j);
    }

    public static void main(String[] args) {

        MethodReferenceDemo mrd = new MethodReferenceDemo();
        I i = mrd::method1; //method ref
        i.m1();
        I1 i1 = mrd::method2;
        i1.m2(3);

        I2 i2 = MethodReferenceDemo::new; //constructor ref
        i2.m3("vivek");

        I3 i3 = MethodReferenceDemo::method4; //static
        i3.m3();

    }
}
/*
Method reference
Method reference with param 3
Hi vivek
static method
 */
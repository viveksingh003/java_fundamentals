@FunctionalInterface
public interface FunctionalInterDemo {
    public void m1();

    default void m2() {
        System.out.println("default method");
    }

    static void m3() {
        System.out.println("static method");
    }
    // public void m2(); --CE

}

class TestApp implements FunctionalInterDemo {

    @Override
    public void m1() {
        System.out.println("implemement m1 method");
    }

    void m3() {
        System.out.println("m3 TestApp class method");
    }

}

class MainApp {
    public static void main(String[] args) {
        FunctionalInterDemo obj = new TestApp();
        obj.m1();
        obj.m2();//default method
        FunctionalInterDemo.m3();//static method calling


    }
}
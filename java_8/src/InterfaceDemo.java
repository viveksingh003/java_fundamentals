public interface InterfaceDemo {
    int i = 10;

    void m1();

    public default void defMethod() {//by default public
        System.out.println("default method inside interface");
    }


}

class Impl implements InterfaceDemo {
    void m2() {
        System.out.println("m2 method");
    }

    @Override
    public void m1() {
        System.out.println("m1 implemented");
    }

    @Override
    public void defMethod() {
        System.out.println("overide def method");
    }
}

class Test {
    public static void main(String[] args) {
        InterfaceDemo obj = new Impl();
        obj.defMethod();
        obj.m1();
        System.out.println(obj.i);
        System.out.println(InterfaceDemo.i);//static var -- gets called by Interface name as well

    }
}

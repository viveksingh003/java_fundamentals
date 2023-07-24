
@FunctionalInterface
public interface LambdaDemo {

    default void m1() {
        System.out.println("def mmethod ");
    }

    static void m2() {
        System.out.println("static method");
    }

    int sum(int a, int b);
}

class TestApp1 {
    public static void main(String[] args) {
        LambdaDemo demo = (a, b) -> a + b;
        demo.sum(1, 2);
        demo.m1();
        LambdaDemo.m2();

    }

}


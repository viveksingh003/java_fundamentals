
class Java {
    int b;

    class Oops {
        // static int b=10;//error
        static final int b = 100;
        int a = 10;//

        void m1() {

        }


    }


}


public class InnerClassDemo {
    public static void main(String[] args) {


        Java java = new Java();
        System.out.println(java.b);
        //  java.a//error

        Java.Oops innerclass = new Java().new Oops();
        System.out.println(innerclass.a);
        innerclass.m1();
        System.out.println(innerclass.b);
        System.out.println(Java.Oops.b);//calling static


    }
}

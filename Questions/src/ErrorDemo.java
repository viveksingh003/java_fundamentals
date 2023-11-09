public class ErrorDemo {


    static void m2(){
        System.out.println("m2");
    }
    static void m1(){
        System.out.println(10/2);
        m2();//called by m1

        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println(10/1);
        }





    }


    public static void main(String[] args) { // jvm



        m1();
        System.out.println("deawrwq");

    }
}







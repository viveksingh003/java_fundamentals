abstract class Demo2 extends Demo1 {
    Demo2()
    {}
    void m1(){
        System.out.println("method");
    }

    abstract void m2();

    public static void main(String[] args) {

        Demo2 d2=null;

    }

}


 class Demo4 extends Demo2{

    void m2(){
        System.out.println("w");
    }

}





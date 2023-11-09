public class Demo10 {

    static void m1()throws MyException{
        System.out.println("m1");
        throw new MyException("UserDefined");

    }

    public static void main(String[] args) {

        try{
        m1();}
        catch (MyException e){
            System.out.println("handkled ");
        }

        finally {
            System.out.println("rescrc close");
        }
    }

}

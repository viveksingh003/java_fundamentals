public class CtachOrderDemo {
    static void m1(){
        throw new ArithmeticException();
    }

    public static void main(String[] args) {
        System.out.println("before method called");
        try{
        m1();}
        catch (NullPointerException ne){

        }
        catch (ArithmeticException e){
            System.out.println("Arithemtic exception");
        }
    }
}

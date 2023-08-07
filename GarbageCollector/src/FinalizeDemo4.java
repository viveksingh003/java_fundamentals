public class FinalizeDemo4 {
public void finalize(){

    System.out.println("Finalize method");
    finalizeDemo4=this;
}
    static FinalizeDemo4 finalizeDemo4;
    public static void main(String[] args) throws InterruptedException {
        FinalizeDemo4 obj=new FinalizeDemo4();
        obj=null;
        System.gc();

        Thread.sleep(5000);
        finalizeDemo4=null;
        System.gc();

    }
}
//Finalize method
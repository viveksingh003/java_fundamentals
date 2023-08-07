public class FinalizeDemo3 {

    public void finalize() {
        System.out.println(10 / 0);
    }

    public static void main(String[] args) {
        FinalizeDemo3 obj = new FinalizeDemo3();
        //  obj.finalize(); // exception will be raised
        obj = null;
        System.gc();
        System.out.println("end");
    }
}

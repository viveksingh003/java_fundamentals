public class FinalizeDemo2 {

    public void finalize() {
        System.out.println("Finalize() gets called");
    }

    public static void main(String[] args) {

        FinalizeDemo2 f = new FinalizeDemo2();
        f.finalize();
        f.finalize();
        f = null;
        System.gc();
        System.out.println("end");


        /*
        Finalize() gets called
        Finalize() gets called
        end
        Finalize() gets called
         */
    }

}

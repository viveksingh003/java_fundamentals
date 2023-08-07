public class FinalizeDemo {

    public void finalize() {
        System.out.println("finalize method");
    }

    public static void main(String[] args) {
        String str = new String("String class ");

        str = null;
        System.gc();
        System.out.println("end main()");//end main()

        //once added this code
        /*
        output --
        end main()
        end
        finalize method
         */
        FinalizeDemo f = new FinalizeDemo();
        f = null;
        System.gc();
        System.out.println("end");

    }


}

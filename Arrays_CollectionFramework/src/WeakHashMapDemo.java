public class WeakHashMapDemo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("destroying");
    }

    public static void main(String[] args) {

        WeakHashMapDemo obj1 = new WeakHashMapDemo();
        System.out.println(obj1);
        obj1 = null;
        System.out.println(obj1);
        System.gc();
        //System.gc() method, will access
        // finalize() method internally just before destroying object.


    }

}

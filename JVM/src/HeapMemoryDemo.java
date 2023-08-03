public class HeapMemoryDemo {
    int i=0;
    public static void main(String[] args) {

        Runtime rt=Runtime.getRuntime();

        System.out.println(rt.maxMemory());//3817865216
        //the maximum amount of memory that the virtual machine will attempt to use, measured in bytes

        System.out.println(rt.totalMemory());//257425408
        //the total amount of memory currently available for current and future objects, measured in bytes.
        System.out.println(rt.freeMemory());//253398816
        //Returns the amount of free memory in the Java Virtual Machine.
        // Calling the gc method may result in increasing the value returned by freeMemory.

        HeapMemoryDemo h=new HeapMemoryDemo();
        h=null;
       // HeapMemoryDemo h1=new HeapMemoryDemo();
        System.gc();
        //System.out.println(h1.i);
        System.out.println(rt.maxMemory());//3817865216
        System.out.println(rt.totalMemory());//257425408
        System.out.println(rt.freeMemory());//254384344

    }
}

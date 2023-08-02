public class ThreadConstructorDemo {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t);//Thread[Thread-0,5,main]

        t.setName("Threadabc");
        System.out.println(t.getName());//Threadabc

        Runnable r = new Thread();//Thread-1
        Thread t1 = new Thread(r);//Thread-2
        System.out.println(t1);//Thread[Thread-2,5,main]


    }
}

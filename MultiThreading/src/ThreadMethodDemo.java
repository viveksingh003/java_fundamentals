public class ThreadMethodDemo {
    public static void main(String[] args) {
        Thread t=new Thread();
        System.out.println(Thread.activeCount());


        System.out.println(t.getPriority());//5
        t.setPriority(1);
        System.out.println(t.getPriority());//1
        System.out.println(t.MAX_PRIORITY-3);//7
        System.out.println(t.getPriority());//1

        System.out.println(t.isAlive());//false
        System.out.println(Thread.activeCount());//2
        t.start();
        System.out.println(t.isAlive());//true
        System.out.println(Thread.activeCount());//3
        System.out.println(Thread.activeCount());//3
    }
}


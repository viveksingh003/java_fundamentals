public class MyThread3 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Hello");
        }

    }
}

class MainApp4 {
    public static void main(String[] args) {

        MyThread3 myThread3 = new MyThread3();

        //case-1
        //myThread3.start();//Compile error
        /*
        start() method was not declared in MyThread class and in its super class
            java.lang.Object class,
            start() method is existed in java.lang.Thread class
         */


        //case-2
      /*  myThread3.run();

      /*
        No Compilation Error, but, only Main thread access MyThread class run() method
        like a normal Java method, no multi threading environment.

        */
        //case -3
       /* Thread t=new Thread();
        t.start();

        */

        /*
        No Compilation Error, start() method creates new thread and it access Thread class
        run() method, not MyThread class run() method.
         */


        //case-4

        Thread t = new Thread(myThread3);
        t.start();
        for (int i = 1; i < 10; i++) {
            System.out.println("Hey");
        }
       /* No CE, start() method creates new thread and it will bypass new
                thread to MyThread class run() method.

        */

        /*
Hey
Hey
Hey
Hey
Hey
Hey
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hello
Hey
Hey
Hey

         */
    }
}

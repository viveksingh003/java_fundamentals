public class ThreadMethodDemo3 extends Thread{
    public void run(){
        for (int i=0;i<3;i++){
            System.out.println("Hello");

            }
    }

}
class App1{
    public static void main(String[] args) throws InterruptedException {
        ThreadMethodDemo3 t=new ThreadMethodDemo3();
        t.start();
        t.join();
        for (int i=0;i<3;i++){
            System.out.println("Hey");

        }

    }
}

/*
Hello
Hello
Hello
Hey
Hey
Hey
 */

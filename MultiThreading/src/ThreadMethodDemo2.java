public class ThreadMethodDemo2 extends Thread{
    public void run(){
        for (int i=0;i<3;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
class App{
    public static void main(String[] args) {
        ThreadMethodDemo2 t=new ThreadMethodDemo2();
        t.start();
    }
}

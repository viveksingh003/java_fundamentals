public class GCollectorThread extends Thread {

    public void run() {
        while (true) {
            System.out.println("GC thread");
        }
    }

}

class App5 {
    public static void main(String[] args) {
        GCollectorThread gc = new GCollectorThread();
        gc.setDaemon(true);
        gc.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("JVM Thread");

        }
    }
}
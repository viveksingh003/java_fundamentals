public class DeadlockDemo {
}

class Query1 extends Thread {

    Object tableA;
    Object tableB;


    public Query1(Object tableA, Object tableB) {
        this.tableA = tableA;
        this.tableB = tableB;

    }

    public void run() {
        synchronized (tableA) {
            System.out.println("Holds tableA waiting for tableB");

            synchronized (tableB) {
                System.out.println("holds both tableA & tableB");
            }
        }


    }


}


class Query2 extends Thread {
    Object tableA;
    Object tableB;


    Query2(Object tableA, Object tableB) {
        this.tableA = tableA;
        this.tableB = tableB;

    }

    public void run() {
        synchronized (tableB) {
            System.out.println("Holds tableB waiting for tableA");
            synchronized (tableA) {
                System.out.println("holds both tableA & tableB");
            }
        }


    }


}

class App3 {
    public static void main(String[] args) {
        Object tableA = new Object();
        Object tableB = new Object();
        Query1 query1 = new Query1(tableA, tableB);
        Query2 query2 = new Query2(tableA, tableB);
        query1.start();
        query2.start();
    }
}
//Holds tableA waiting for tableB
//Holds tableB waiting for tableA
//Deadlock Situation
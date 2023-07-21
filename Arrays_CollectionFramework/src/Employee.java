import java.util.Comparator;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {

    int eId;
    String eName;
    float eSal;

    Employee(int eId, String eName, float eSal) {
        this.eId = eId;
        this.eName = eName;
        this.eSal = eSal;

    }

    @Override
    public String toString() {
        // System.out.println("Eid "+eId+", EName "+eName+", ESal "+eSal+"\n");
        return "Eid " + eId + ", EName " + eName + ", ESal " + eSal + "\n";
        //return "";
    }


    @Override
    public int compareTo(Employee o) {
        int val = this.eName.compareTo(o.eName);
        return val;
    }
}

class MyComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee o1, Employee o2) {
        int val=o1.eName.compareTo(o2.eName);
        return -val;
    }
}

class App {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Vivek", 100.0f);
        Employee emp2 = new Employee(2, "Abhi", 1000.0f);
        Employee emp3 = new Employee(3, "Gaurav", 10000.0f);
        //System.out.println(emp1);


        TreeSet ts = new TreeSet<>();
        ts.add(emp1);
        ts.add(emp2);
        ts.add(emp3);
        System.out.print(ts);
        TreeSet ts1 = new TreeSet<>(new MyComparator());
        ts1.add(emp1);
        ts1.add(emp2);
        ts1.add(emp3);
        System.out.print(ts1);


    }

}

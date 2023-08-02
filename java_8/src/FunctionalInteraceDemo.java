
import java.util.Comparator;
import java.util.TreeSet;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID " + id + " name " + name;
    }
}

/*class MyComparator implements Comparator<Student> {


    @Override
    public int compare(Student o,Student o1) {

        int val=o.name.compareTo(o1.name);

        return val;
    }
}

 */

public class FunctionalInteraceDemo {
    public static void main(String[] args) {


        Student stud = new Student(333, "vivek");
        Student stud1 = new Student(111, "Abhi");
        Student stud2 = new Student(555, "Akash");
        System.out.println(stud2);

        /*TreeSet ts=new TreeSet<>(new MyComparator());
        ts.add(stud);
        ts.add(stud1);
        ts.add(stud2);
        System.out.println(ts);

         */

        TreeSet ts = new TreeSet<Student>((o, o1) -> o.name.compareTo(o1.name));
        ts.add(stud);
        ts.add(stud1);
        ts.add(stud2);
        System.out.println(ts);

    }


}

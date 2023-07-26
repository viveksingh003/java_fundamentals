import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;
    public static int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void getStudentDetails() {
        System.out.println("Student Details");
        System.out.println("ID " + id);
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }

}


public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/viveksingh/serializabledemo.txt");


        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student stud = new Student(123, "vivek", 25);

        oos.writeObject(stud);
        stud.getStudentDetails();


    }


}

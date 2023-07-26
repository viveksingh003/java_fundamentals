import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

    public static void main(String[] args) throws Exception {

        FileInputStream fis=new FileInputStream("/Users/viveksingh/serializabledemo.txt");

        ObjectInputStream ois=new ObjectInputStream(fis);

        Student stud=(Student) ois.readObject();

        System.out.println(stud);
        stud.getStudentDetails();


    }
}

import java.io.*;

class User implements Externalizable {

    public User(String uId, String uName, String email) {
        this.uId = uId;
        this.uName = uName;
        this.email = email;
    }

    String uId;
    String uName;
    String email;


    public User() {

    }

    public void getUserDetails() {
        System.out.println("User Details");
        System.out.println("Name of User " + uName);
        System.out.println("Id of User " + uId);
        System.out.println("Email of User " + email);


    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        String token[] = email.split("@");//{abc,icloud.com}
        email = token[0];
        String token1[] = uId.split("-");//{CA,111}//CA-111
        uId = token1[1];

        out.writeUTF(email);//out.out.writeInt(--) if int
        out.writeUTF(uId);
        out.writeUTF(uName);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        uId = "CA-" + in.readUTF();
        uName = in.readUTF();
        email = in.readUTF() + "@icloud.com";
    }
}

public class ExternalizationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("/Users/viveksingh/user.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        User u1 = new User("CA-111", "Vivek", "vivek111@icloud.com");
        System.out.println("User Details before serialization");
        u1.getUserDetails();
        oos.writeObject(u1);

        FileInputStream fis = new FileInputStream("/Users/viveksingh/user.txt");
        ObjectInputStream oid = new ObjectInputStream(fis);
        User u2 = (User) oid.readObject();
        System.out.println("After deserialization");
        u2.getUserDetails();
        System.out.println();


    }


}
/*
User Details before serialization
User Details
Name of User Vivek
Id of User CA-111
Email of User vivek111@icloud.com
After deserialization
User Details
Name of User 111
Id of User CA-vivek111
Email of User Vivek@icloud.com
 */
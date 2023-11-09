public class Q11 {

    int eID;

    public int geteID() {
        return eID;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;


}
class TestApp{
    public static void main(String[] args) {


    Q11 q11=new Q11();
    q11.seteID(1);
    q11.setName("v");

    q11.geteID();

        System.out.println("ID"+q11.geteID()+"name"+q11.getName());
}}
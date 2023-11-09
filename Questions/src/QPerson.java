
/*
Create a class called "Person" with attributes: name, age, and occupation.
Implement getters and setters for these attributes.
Then, create an instance of the "Person" class and display their information.
 */
public class QPerson {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccup() {
        return occup;
    }

    public void setOccup(String occup) {
        this.occup = occup;
    }

    private String name;
    private int age;
    private String occup;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        QPerson p1=new QPerson();
        p1.setAge(18);
        p1.setName("Vivek");
        p1.setOccup("Dev");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getOccup());
    }

}

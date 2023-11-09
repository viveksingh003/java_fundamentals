public class Vehicle {

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
        System.out.println("aa");
    }

    public String getMake() {
        System.out.println("aaaa");
        return make;

    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    String make;
    String model;





}
class Car extends Vehicle{

    public Car(String make, String model) {
        super(make, model);
    }
}
class App9{
    public static void main(String[] args) {


    Car c=new Car("22","as2");

        System.out.println(c.getMake());
}}
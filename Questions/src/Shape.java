public interface Shape {
    void calculateArea();

}

class Circle implements Shape{
    @Override
    public void calculateArea() {
        System.out.println("Circle ARea");

    }
}

class Rectangle implements Shape{

    @Override
    public void calculateArea() {

        System.out.println("Rec ARea");

    }
}

class App5{
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        Circle circle=new Circle();

        Shape[] shape={rec,circle};
        for(int i=0;i<shape.length;i++){
            shape[i].calculateArea();

        }

    }
}


/*
Create a base class called "Animal" with attributes: name and sound. Implement a method called "makeSound" that prints the sound of the animal. Create two subclasses: "Dog" and "Cat" that extend the "Animal" class and override the "makeSound" method to print a specific sound for each animal.
Create instances of both "Dog" and "Cat" classes, and call the "makeSound" method to verify the output.
 */
public class Animal {

    void makeSound(Animal animal){
        System.out.println("make sound");

    }



}

class Cat extends Animal{

}
class Dog extends Animal{

}
class App6{
    public static void main(String[] args) {
        Cat c=new Cat();
        Dog d=new Dog();

        Animal a=new Animal();
        a.makeSound(c);
        a.makeSound(d);




    }
}
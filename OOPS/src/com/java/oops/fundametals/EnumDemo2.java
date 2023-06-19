package com.java.oops.fundametals;


enum Fruits {
    Apple(1, 200), Orange(1, 100), Pomegrante(1, 180);

    int quant;
    double price;

    Fruits(int quant, double price) {
        this.quant = quant;
        this.price = price;
    }

    public void getFruitDetails() {
        System.out.println(quant + "   " + price);
    }
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Fruits.Apple.getFruitDetails();
        Fruits.Orange.getFruitDetails();
        Fruits.Pomegrante.getFruitDetails();
    }
}

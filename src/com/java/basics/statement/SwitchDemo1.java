package com.java.basics.statement;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to book tickets: - Airplane , Train ,Taxi");
        String s = sc.next();
        switch (s) {
            default:
                System.out.println("Invalid entry");
                break;
            case "Airplane":
            case "airplane":
                System.out.println("Flight booked");
                break;
            case "Train":
            case "train":
                System.out.println("Train Booked");
                break;
            case "Taxi":
            case "taxi":
                System.out.println("Taxi Booked");
                break;

        }


    }
}

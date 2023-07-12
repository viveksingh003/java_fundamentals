package com.java.basics.statement;

public class SwitchStatement {

    public static void main(String[] args) {

        String a = "ABC";
        switch (a) {
            default:
                System.out.println("default");
                break;
            case "DEF":
            case "Two Cases Together":
                System.out.println("Option 1");
                break;
            case "ABC":
                System.out.println("Option 2");
                break;

        }

    }
}

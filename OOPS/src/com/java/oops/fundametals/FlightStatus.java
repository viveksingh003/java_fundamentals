package com.java.oops.fundametals;

import java.util.SortedMap;

public enum FlightStatus {
    Scheduled, Delayed, Departed
}

class Enumdemo {
    public static void main(String[] args) {
        System.out.println(FlightStatus.Scheduled);
        System.out.println(FlightStatus.Delayed);
        System.out.println(FlightStatus.Departed);
    }

}

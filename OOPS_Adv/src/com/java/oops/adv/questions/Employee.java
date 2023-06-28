package com.java.oops.adv.questions;

public class Employee {

    int eID;
    String name;
    float eSal;

    public void getEmpDetails() {
        System.out.println("EmpId " + eID);
        System.out.println("EmpName " + name);
        System.out.println("EmpSal " + eSal);
    }

}

class Manager extends Employee {
    public Manager(int eId, String eName, float eSal) {
        this.eID = eId;
        this.name = eName;
        this.eSal = eSal;
    }

    public void getManagerDetails() {
        System.out.println("Manager Details");
        System.out.println();
        getEmpDetails();
    }
}

class Developer extends Employee {
    public Developer(int eId, String eName, float eSal) {
        this.eID = eId;
        this.name = eName;
        this.eSal = eSal;
    }

    public void getDeveloperDetails() {
        System.out.println("Developer Details");
        System.out.println();
        getEmpDetails();
    }


}


class Test {
    public static void main(String[] args) {
        Manager m1 = new Manager(1223, "Suresh", 123456.0f);
        m1.getManagerDetails();
        Developer d1 = new Developer(122, "Ashish", 1122.0f);
        System.out.println();
        d1.getDeveloperDetails();





    }
}

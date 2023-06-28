package com.java.oops.adv.test;

import com.java.oops.adv.entities.Department;
import com.java.oops.adv.entities.Employee_1;

public class Test2 {
    public static void main(String[] args) {

        Employee_1 e = new Employee_1();//can define para constand can use that as wel;
        e.seteID(111);
        e.seteName("Vivek");
        e.seteSal(1000.0f);
        e.seteAddrs("patna");
        Employee_1 e1 = new Employee_1();
        e1.seteID(222);
        e1.seteName("Ravi");
        e1.seteSal(10000.0f);
        e1.seteAddrs("Pune");
        Employee_1 e2 = new Employee_1();
        e2.seteID(333);
        e2.seteName("Keviv");
        e2.seteSal(10500.0f);
        e2.seteAddrs("Blr");
        Employee_1 e3 = new Employee_1();
        e3.seteID(444);
        e3.seteName("Abhi");
        e3.seteSal(10333.0f);
        e3.seteAddrs("Hyd");

        Employee_1[] emps = {e, e1, e2, e3};
        Department d = new Department();
        d.setDepId(12345);
        d.setDepName("IT");
        d.setEmps(emps);
        d.getDepDetails();
    }
}

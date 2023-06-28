package com.java.oops.adv.entities;

public class Department {
    private int depId;
    private String depName;
    Employee_1[] emps;

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Employee_1[] getEmps() {
        return emps;
    }

    public void setEmps(Employee_1[] emps) {
        this.emps = emps;
    }

    public void getDepDetails() {
        System.out.println("Dept Details");
        System.out.println("DeptID " + depId);
        System.out.println("DeptName " + depName);
        System.out.println("eID\teName\teSal\teAddrs");
        System.out.println("--------------------------");
        for (Employee_1 emp : emps
        ) {
            System.out.print(emp.geteID() + "\t");
            System.out.print(emp.geteName() + "\t");
            System.out.print(emp.geteAddrs() + "\t");
            System.out.print(emp.geteSal() + "\n");


        }


    }


}

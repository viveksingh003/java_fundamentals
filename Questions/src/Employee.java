/*
Create a class called "Employee" with attributes: employeeID, name, and monthly salary.
Implement a method to calculate the annual salary (12 times the monthly salary).
Create an array of "Employee" objects and display their names and annual salaries.
 */

public class Employee {

    int empId;
    String name;
    float montSal;

    void calSal(float montSal){
        System.out.println(montSal*12);

    }
}

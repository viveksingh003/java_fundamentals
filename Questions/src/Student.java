
/*
Design a class called "Student" with attributes: name, roll number, and an array of marks in different subjects.
Implement a method to calculate the average marks of a student. Create an instance of the "Student" class, add marks,
 and display the averageDesign a class called "Student" with attributes: name, roll number, and an array of marks in
 different subjects. Implement a method to calculate the average marks of a student.
Create an instance of the "Student" class, add marks, and display the average
 */
public class Student {
    String name;
    int roll;
    int [] marks;

    void avgMarks(int [] marks){
        int avg=0;

        int numberOfsub=marks.length;
        int sum=0;
        for (int i=0;i<marks.length;i++){
            sum=sum+marks[i];



        }

        avg=avg+(sum/numberOfsub);
        System.out.println(avg);



    }

    public static void main(String[] args) {
        Student stu=new Student();
        int marks[]={90,95,91,87,83};
        stu.avgMarks(marks);
    }
}


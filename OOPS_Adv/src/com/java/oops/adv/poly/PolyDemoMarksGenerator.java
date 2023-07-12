package com.java.oops.adv.poly;

public class PolyDemoMarksGenerator {

    public void generateMarks(float sub1Marks, float sub2Marks, float sub3Marks
            , float sub4Marks, float sub5Marks) {
        double totalMarks = sub1Marks + sub2Marks + sub3Marks + sub4Marks + sub5Marks;
        System.out.println("Total Marks without grace  -: " + totalMarks);

    }
    public void generateMarks(float sub1Marks, float sub2Marks, float sub3Marks
            , float sub4Marks, float sub5Marks,float gracemarks) {
        double totalMarks = sub1Marks + sub2Marks + sub3Marks + sub4Marks + sub5Marks+gracemarks;
        System.out.println("Total Marks With grace  -: " + totalMarks);

    }

    public static void main(String[] args) {
        PolyDemoMarksGenerator p=new PolyDemoMarksGenerator();
        p.generateMarks(70,82,95,65,77);
        p.generateMarks(70,82,95,65,77,5);
    }
}

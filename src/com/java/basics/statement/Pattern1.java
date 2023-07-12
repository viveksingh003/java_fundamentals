package com.java.basics.statement;

public class Pattern1 {
    public static void main(String[] args) {


        for (int i =0;i<10;i++){
            for (int j=0;j<10;j++){
                //System.out.print("*"+'\t');//add tab in b/w
              //  System.out.print(i+" "+'\t');
                //  System.out.print(char(65+j)+" ");
                //System.out.print((char)(65+j)+" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//row number maintained in outer loop
//**********
//**********
//**********
//**********
//**********
//**********
//**********
//**********
//**********
//**********

/*
0 	1 	2 	3 	4 	5 	6 	7 	8 	9
0 	1 	2 	3 	4 	5 	6 	7 	8 	9
0 	1 	2 	3 	4 	5 	6 	7 	8 	9
0 	1 	2 	3 	4 	5 	6 	7 	8 	9
0 	1 	2 	3 	4 	5 	6 	7 	8 	9
0 	1 	2 	3 	4 	5 	6 	7 	8 	9
0 	1 	2 	3 	4 	5 	6 	7 	8 	9
0 	1 	2 	3 	4 	5 	6 	7 	8 	9
0 	1 	2 	3 	4 	5 	6 	7 	8 	9
0 	1 	2 	3 	4 	5 	6 	7 	8 	9
 */

/*
0 	0 	0 	0 	0 	0 	0 	0 	0 	0
1 	1 	1 	1 	1 	1 	1 	1 	1 	1
2 	2 	2 	2 	2 	2 	2 	2 	2 	2
3 	3 	3 	3 	3 	3 	3 	3 	3 	3
4 	4 	4 	4 	4 	4 	4 	4 	4 	4
5 	5 	5 	5 	5 	5 	5 	5 	5 	5
6 	6 	6 	6 	6 	6 	6 	6 	6 	6
7 	7 	7 	7 	7 	7 	7 	7 	7 	7
8 	8 	8 	8 	8 	8 	8 	8 	8 	8
9 	9 	9 	9 	9 	9 	9 	9 	9 	9
 */
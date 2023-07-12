package com.java.oops.fundametals;

public class VarArgDemo {
    int sum = 0;
    int sum1 = 0;

    int sum(int a, int b) {
        int j = a + b;
        return j;
    }
void sub(float a, int...b){

}
    void sum1(int... a) {
        System.out.println(a.length);

        System.out.println("var_arg method");
        for (int x : a
        ) {
            System.out.print(x + " ");

            sum = x + sum;


        }
        System.out.println();
        System.out.println(sum);

        for (int i = 0; i < a.length; i++) {
            sum1 = a[i] + sum1;
        }
        System.out.println("sum1 " + sum1);

    }

    public static void main(String[] args) {

        VarArgDemo v = new VarArgDemo();
        System.out.println(v.sum(10, 28));
        v.sum1(2, 3, 4, 5, 5);
        v.sum1(1,2,3,4,5,5,6);
        v.sum1();//0

    }
}

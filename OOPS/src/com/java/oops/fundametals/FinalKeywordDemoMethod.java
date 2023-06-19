package com.java.oops.fundametals;

public class FinalKeywordDemoMethod {
    final void method1() {
        System.out.println("final method 1");
    }

    void method2() {
        System.out.println("method2");
    }

    public static void main(String[] args) {


    }

}

class FinalKeywordDemoMethod_ extends FinalKeywordDemoMethod {
    @Override
    final void method2() { // we can make this final as well
        System.out.println("method2 Override");
    }
//    @Override
//    void method1() {
//        System.out.println("method2 Override");
//    }
    //'method1()' cannot override 'method1()'

    public static void main(String[] args) {
        FinalKeywordDemoMethod_ obj = new FinalKeywordDemoMethod_();
        obj.method1();//"final method 1"
        obj.method2();//method2 Override

    }
}
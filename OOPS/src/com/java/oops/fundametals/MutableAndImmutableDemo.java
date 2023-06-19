package com.java.oops.fundametals;

public class MutableAndImmutableDemo {

    public static void main(String[] args) {

        String s1 = new String("abc");
        String s2 = s1.concat("def");
        String s3 = s2.concat("ghi");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println();

        StringBuffer str1 = new StringBuffer("Hey ");
        StringBuffer str2 = str1.append("How are ");
        StringBuffer str3 = str2.append("you");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println();

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s1);

        System.out.println("--");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str1);

    }
}

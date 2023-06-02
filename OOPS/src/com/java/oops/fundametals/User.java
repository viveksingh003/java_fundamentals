package com.java.oops.fundametals;

public class User {
    private String uname;
    private String upwd;


    public void setUname(String name) {

        uname = name;
    }

    public void setUpwd(String pwd) {
        upwd = pwd;
    }

    public String getUname() {

        return uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public static void main(String[] args) {
        User u = new User();
        u.uname = "Vivek";
        u.upwd = "Qwerty";
        System.out.println(u.uname + "  " + u.upwd);
       u.setUname("viveksingh");
        System.out.println(u.getUname());


    }

}


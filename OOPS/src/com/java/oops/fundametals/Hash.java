package com.java.oops.fundametals;

//HashCode demo
public class Hash {


}

class HashCodeDemo {
    public static void main(String[] args) {
        Hash hash = new Hash();
        int a = hash.hashCode();
        String b = hash.toString();

        System.out.println("Hashcode value " + a + " RefernceValue " + b);

        //Hashcode value 356573597 RefernceValue com.java.oops.fundametals.Hash@1540e19d
    }
}

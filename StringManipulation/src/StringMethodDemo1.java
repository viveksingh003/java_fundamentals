public class StringMethodDemo1 {
    public static void main(String[] args) {
        String s1=new String("akash");
        String s2=new String("vivek");

        System.out.println(s1.compareTo(s2));//-
        System.out.println(s1.startsWith("a"));//t
        System.out.println(s1.endsWith("s"));//f
        System.out.println(s1.contains("as"));//t
        System.out.println(s1.replace("ak","vik"));
        System.out.println(s1);
        System.out.println(s1.charAt(0));//a
        System.out.println(s1.indexOf("k"));//1
        System.out.println(s1.lastIndexOf("a"));//2
        System.out.println(s1.substring(2));//ash
        System.out.println(s1.substring(1,4));//kas(not include 4th)
        System.out.println();


        System.out.println(s1.getBytes());//[B@1540e19d
        System.out.println(s1.toCharArray());//akash
        byte b[]=s1.getBytes();
        System.out.println(b);//[B@677327b6
        for(byte b1:b){
            System.out.println(b1);
            /*
            97
            107
            97
            115
            104
             */

        }

        System.out.println(s1.toCharArray());//akash
        char[]a=s1.toCharArray();
        System.out.println(a);//akash
        for(char c:a){
            System.out.println(c);
            /*
            a
            k
            a
            s
            h
             */

        }

        System.out.println(s1.split("a"));
        System.out.println(new String("abc ").trim());//abc
        System.out.println(s1.toUpperCase());//AKASH
        System.out.println(new String("ABc").toLowerCase());//abc

    }
}

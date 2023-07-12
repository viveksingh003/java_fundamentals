public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer str1 = new StringBuffer();
        System.out.println(str1.capacity());//16 //def capacity
        StringBuffer str = new StringBuffer("abc");//16+3=19
        System.out.println(str.capacity());

        StringBuffer str2 = new StringBuffer();
        System.out.println(str2.length());//length->0


        StringBuffer str4 = new StringBuffer(10);//changing def capacity
        System.out.println(str4.capacity());


        System.out.println(str);
        String str5 = new String();
        System.out.println(str5);
        StringBufferDemo sd = new StringBufferDemo();
        System.out.println(sd);

    }
}

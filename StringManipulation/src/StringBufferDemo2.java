public class StringBufferDemo2 {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("vivek");
        System.out.println(str.reverse());

        String str1 = "vivek";
        //StringBuffer str2=(StringBuffer)str1;


        StringBuffer str4 = new StringBuffer(str1);
        System.out.println(str4.reverse());
        System.out.println(str.reverse());//vivek
    }
}

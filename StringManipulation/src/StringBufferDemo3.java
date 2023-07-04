public class StringBufferDemo3 {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("vivek ");
        str.insert(6, "singh");//start-offset
        System.out.println(str);

        str.delete(5, 11);//start-offset
        System.out.println(str);

    }
}

public class StringBufferDemo1 {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("a");
        System.out.println(str);//a
        StringBuffer str1 = str.append("b");
        StringBuffer str2 = str.append("c");
        System.out.println(str);//abc
        System.out.println(str1);//abc
        System.out.println(str2);//abc
        StringBuffer str5 = new StringBuffer(16);
        str5.ensureCapacity(16);
        System.out.println(str5.capacity());

    }
}

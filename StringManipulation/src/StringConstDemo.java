public class StringConstDemo {

    byte b[] = new byte[]{65, 66, 67, 68, 69};

    //public String(byte[] b)
    StringConstDemo(byte[] b1) {
        String s = new String(b1);
        System.out.println(s);

    }

    String a = new String();
    //public String(byte[] b, int start_index, int no_Of_Chars)
    String b1 = new String(b, 2, 3);


    //public String(char[] ch)
    String c = new String(new char[]{'v', 'i', 'v', 'e', 'k'});

    //public String(char[] ch, int start_Index,int no_Of_Chars)
    String d = new String(new char[]{'v', 'i', 'v', 'e', 'k'}, 1, 4);

    public static void main(String[] args) {
        StringConstDemo s = new StringConstDemo(new byte[]{65, 66, 67, 68, 69});
        String s1 = new String(new byte[]{65, 66, 67, 68, 69});
        System.out.println(s1);
        s.b = new byte[]{97, 98, 99, 100, 101};
        StringConstDemo s2 = new StringConstDemo(s.b);
        System.out.println(s2);
        System.out.println(s.b1);//CDE
        System.out.println(s.c);
        System.out.println(s.d);


    }

}

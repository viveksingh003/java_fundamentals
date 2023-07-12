public class StringMethoDemo {

    public static void main(String[] args) {
        String str = "abcde";
        String s = new String("abcde");
        String s6 = new String("12345 ");
        System.out.println(s6.length());
        System.out.println(s.concat("efgh"));
        System.out.println(s);//abcde
        String s4=s.concat("efgh");
        System.out.println(s4);
        String s5=s.concat("efgh").concat("ijkl");
        System.out.println(s5);

        String s1 = new String("abcde");
        System.out.println(s == str);
        System.out.println(s == s1);

        System.out.println(s.equals(str));
        System.out.println(s.equals(s1));


    }
}

public class DoubleEqualsOperatorequalsMethodDemo {
    public static void main(String[] args) {

        int i = 9;
        int j = 9;
        System.out.println(i == j);//t


        DoubleEqualsOperatorequalsMethodDemo d = new DoubleEqualsOperatorequalsMethodDemo();
        DoubleEqualsOperatorequalsMethodDemo d1 = new DoubleEqualsOperatorequalsMethodDemo();
        System.out.println(d == d1);//f
        System.out.println(d.equals(d1));//f
        String s = "vivek";
        String s1 = "vivek";
        String s2 = new String("vivek");
        System.out.println(s == s1);//t
        System.out.println(s == s2);//f
        System.out.println(s.equals(s1));//t

    }
}

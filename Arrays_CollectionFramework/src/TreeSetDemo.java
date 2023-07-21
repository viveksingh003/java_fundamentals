import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet<>();
        ts.add("aaa");
        ts.add("fff");
        ts.add("e");
        ts.add("bbb");
        ts.add("AAA");
        ts.add("cc");
        //ts.add(null);--> NullPointerException
//ts.add(new Integer(10));-->ClassCastException
//ts.add(new StringBuffer("BBB"));->ClassCastException
        System.out.println(ts);
    }
}

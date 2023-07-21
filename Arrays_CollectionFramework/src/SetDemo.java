import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {


        Set s=new HashSet();
        s.add(1);
        s.add(2);
        s.add(2);
        s.add(3);
        s.add(null);
        s.add(null);
        System.out.println(s);
        //[null, 1, 2, 3] -- no duplicates , only one null allowed

        Set s1=new HashSet<>();
        System.out.println(s1);//[]
        Set s2=new HashSet<>(10);
        Set s3=new HashSet<>(10,100.0f);
        Set s4=new HashSet<>(s);
        System.out.println(s4);//[null, 1, 2, 3]

    }
}

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add("a");
        al.add('a');
        System.out.println(al);//[1, a, a]
        System.out.println(al.get(0));//1
        //Integer i=al.get(0);//req type -Integer provided Object
        Integer i = (Integer) al.get(0);
        System.out.println(i);//1

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(1);
        al1.add(2);
        System.out.println(al1);
        //al1.add("a");//req type -Integer provided String
        System.out.println(al1.get(0));
        Integer i1 = al1.get(0);//1
        System.out.println(i1);//1 // no type conversion or downcasting


    }
}

import java.util.ArrayList;
import java.util.TreeSet;

public class ArraysCollDemo {


    public static void main(String[] args) {
        ArraysCollDemo a[] = new ArraysCollDemo[2];
        a[0] = new ArraysCollDemo();
        a[1] = new ArraysCollDemo();
        //a[2]=new ArrayDemo();//incompatible types//homogeneous
        //a[2]=new ArraysCollDemo();
        //Exception ->java.lang.ArrayIndexOutOfBoundsException: 2

        ArrayList arr = new ArrayList<>(2);
        arr.add(new ArraysCollDemo());
        arr.add(new ArraysCollDemo());
        arr.add(new ArraysCollDemo());//no error
        arr.add(new ArrayDemo());//no error// heterogeneous


        String s[] = {"abc", "ghi", "def"};//no sort operation
        TreeSet tr = new TreeSet<>();
        tr.add("def");
        tr.add("abc");
        tr.add("ghi");
        System.out.println(tr);//[abc, def, ghi]// sorted


    }


}

import java.util.ArrayList;

public class CollectionMethohdsDemo2 {

    public static void main(String[] args) {


        ArrayList arr = new ArrayList();
        arr.add("a");
        arr.add("b");

        ArrayList arr1 = new ArrayList();
        arr1.add("c");
        arr1.add("d");

        System.out.println(arr.contains("a"));
        System.out.println(arr.contains("f"));
        System.out.println(arr.addAll(arr1));
        System.out.println(arr.containsAll(arr1));
        System.out.println(arr);

        System.out.println(arr.retainAll(arr1));
        System.out.println(arr);

    }
}

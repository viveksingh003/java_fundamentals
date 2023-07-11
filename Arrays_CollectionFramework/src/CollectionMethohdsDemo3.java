import java.util.ArrayList;

public class CollectionMethohdsDemo3 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        System.out.println(arr);

        System.out.println(arr.size());
        // System.out.println(arr.clear());//RType-void
        arr.clear();
        System.out.println(arr);
        System.out.println(arr.isEmpty());
        arr.add(null);
        System.out.println(arr.isEmpty());

        arr.add(1);
        arr.add(2);
        arr.add('c');
        arr.add("d");
        System.out.println(arr);//[null, 1, 2, c, d]
        Object[] array = arr.toArray();
        System.out.println(array);//[Ljava.lang.Object;@1540e19d
        System.out.println(array[0]);//null

        for (Object o : array) {
            System.out.print(o + " ");//null 1 2 c d
        }

    }
}

import java.util.ArrayList;

public class ArrayListDemo {


    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();//def capacity ->10
        ArrayList arr1 = new ArrayList<>(20);

        System.out.println(arr);//[]
        System.out.println(arr.size());//0
        // System.out.println(arr.capacity);//we dont have capacity method
        arr.add(1);
        arr.add(2);
        arr.add(3);
        ArrayList arr2 = new ArrayList<>(arr);
        System.out.println(arr2);//[1, 2, 3]
    }

}

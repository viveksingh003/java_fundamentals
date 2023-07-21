import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap hm = new HashMap<>();
        System.out.println(hm);//{}
        HashMap<String, String> hm1 = new HashMap<String, String>(10);
        System.out.println(hm1);//{}
        HashMap hm2 = new HashMap<>(10, 0.85f);
        System.out.println(hm2);//{}
        HashMap hm3 = new HashMap<>();
        hm3.put(1, 'A');
        hm3.put(2, "Ab");
        hm3.put('a', 123);
        System.out.println(hm3);//{1=A, a=123, 2=Ab}
        HashMap hm4 = new HashMap<>(hm3);
        System.out.println(hm4);//{1=A, a=123, 2=Ab}


    }

}

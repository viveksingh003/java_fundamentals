import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {

        NavigableMap nvm = new TreeMap();
        nvm.put(3, "Three");
        nvm.put(1, "two");
        nvm.put(6, "six");
        nvm.put(5, "five");
        nvm.put(2, "two");
        System.out.println(nvm);////{1=two, 2=two, 3=Three, 5=five, 6=six}//sorted

        System.out.println(nvm.ceilingKey(5));//5
        System.out.println(nvm.floorKey(5));//5
        System.out.println(nvm.higherKey(4));//5
        System.out.println(nvm.lowerKey(5));//3
        System.out.println(nvm.descendingMap());//*** //{6=six, 5=five, 3=Three, 2=two, 1=two}
        System.out.println(nvm.pollFirstEntry());// 1=two
        System.out.println(nvm.pollLastEntry());// 6=six
        System.out.println(nvm);//{2=two, 3=Three, 5=five}

    }
}

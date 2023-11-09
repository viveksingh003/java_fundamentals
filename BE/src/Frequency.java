import java.util.*;

public class Frequency {
    public static void main(String[] args) {



        Map<Integer,Integer> m=new HashMap<>();
        m.put(1,4);
        m.put(2,3);

        Set<Map.Entry<Integer,Integer>> s=m.entrySet();
        for (Map.Entry<Integer,Integer> q:s
             ) {
            System.out.println(q.getKey());
            System.out.println(q.getValue());
            
        }
        System.out.println(s);







          }
      }



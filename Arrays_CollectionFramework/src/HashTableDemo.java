import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(null, 1);
        hm.put(null, 2);
        hm.put(2, null);
        System.out.println(hm);//{null=2, 2=null}//only one value allowed ayt key side

        Hashtable hst = new Hashtable();
        // hst.put(null,1);//NullPointerException
        //  hst.put(2,null);//NullPointerException


    }
}

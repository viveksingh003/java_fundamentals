import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector v = new Vector();
        System.out.println(v.capacity());
        Vector v1 = new Vector();
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        v1.add(7);
        v1.add(8);
        v1.add(9);
        v1.add(10);//10
        v1.add(11);//20
        System.out.println(v1.capacity());
        Vector v2 = new Vector<>(20);
        System.out.println(20);
        Vector v3 = new Vector<>(10, 3);
        v3.add(1);
        v3.add(2);
        v3.add(3);
        v3.add(4);
        v3.add(5);
        v3.add(6);
        v3.add(7);
        v3.add(8);
        v3.add(9);
        v3.add(10);
        System.out.println(v3.capacity());
        v3.add(11);
        System.out.println(v3.capacity());//13


        Vector v4 = new Vector<>();
        v4.addElement(1);
        v4.addElement(2);
        System.out.println(v4.firstElement());
        System.out.println(v4.lastElement());
        System.out.println(v4.elementAt(0));
        System.out.println(v4.removeElement(2));
        System.out.println(v4);
        v4.removeElementAt(0);
        System.out.println(v4);
        v4.add(v1);
        System.out.println(v4);
        v4.removeAllElements();
        System.out.println(v4);


    }
}

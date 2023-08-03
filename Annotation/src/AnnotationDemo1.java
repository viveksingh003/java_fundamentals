import java.util.ArrayList;
import java.util.List;

public class AnnotationDemo1 {

/*
without using annotation while compilation we will get this warnings
viveksingh@Viveks-MacBook-Pro src % javac AnnotationDemo1.java
Note: AnnotationDemo1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

 */

    //with annotation , we won't be getting any warnings.
    @SuppressWarnings(value = "unchecked")
    public ArrayList getList() {
        ArrayList al = new ArrayList<>();
        al.add("vivek");
        return al;
    }

    public static void main(String[] args) {

        AnnotationDemo1 ad = new AnnotationDemo1();
        List l = ad.getList();
        System.out.println(l);

    }

}

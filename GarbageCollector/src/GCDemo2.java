public class GCDemo2 {

    GCDemo2 gcDemo2;

    public static void main(String[] args) {


        GCDemo2 obj1=new GCDemo2();
        GCDemo2 obj2=new GCDemo2();
        GCDemo2 obj3=new GCDemo2();

        obj1.gcDemo2=obj2;
        obj2.gcDemo2=obj3;
        obj3.gcDemo2=obj1;

        obj1=null; //No Object is eligible for GC.
        obj2=null;//No Object is eligible for GC.
        obj3=null;//All Objects are eligible for  GC, because, all Explicit references are nullified


    }
}

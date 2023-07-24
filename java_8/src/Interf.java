public interface Interf {
    public static void main(String[] args) {
        System.out.println("main inside interface");
    }
}

class Test1 implements Interf {
    public static void main(String[] args) {
        System.out.println("hello");
        Interf.main(new String[]{"a"});
        //hello
        //main inside interface

    }
}

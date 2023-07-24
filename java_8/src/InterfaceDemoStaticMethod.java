public interface InterfaceDemoStaticMethod {

    static void staticmethod() {
        System.out.println("static method inside interface");
    }


}

class App implements InterfaceDemoStaticMethod {
    public static void main(String[] args) {

        InterfaceDemoStaticMethod ids = new App();
        //ids.staticmethod//CE // not available by default
        InterfaceDemoStaticMethod.staticmethod();
    }
}

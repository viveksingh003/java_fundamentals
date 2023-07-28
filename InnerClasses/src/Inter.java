public interface Inter {

    void m1();

    class A implements Inter {


        @Override
        public void m1() {

        }
    }

    class B {

    }


}

class Demo {

    public static void main(String[] args) {

        Inter i = new Inter.A();
        i.m1();
    }
}



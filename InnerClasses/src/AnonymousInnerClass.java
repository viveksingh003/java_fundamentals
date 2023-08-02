
interface I {
    void m1();

    void m2();

    void m3();

}

class AnonymousInnerClass {

    int a = ab();

    int ab() {
        System.out.println("a");
        return 1;
    }

    I i = new I() {
        public void m1() {
            System.out.println("m1--");
        }

        ;

        public void m2() {
            System.out.println("m2--");
        }

        ;

        public void m3() {
            System.out.println("m3--");
        }

        ;
    };

    public static void main(String[] args) {


        I i = new I() {
            public void m1() {
                System.out.println("m1");
            }

            ;

            public void m2() {
                System.out.println("m2");
            }

            ;

            public void m3() {
                System.out.println("m3");
            }

            ;
        };


        AnonymousInnerClass a = new AnonymousInnerClass();
        i.m1();
        a.i.m1();
    }
}


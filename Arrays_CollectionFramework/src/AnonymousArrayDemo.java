public class AnonymousArrayDemo {
    static void m1(int a[]) {
        for (int b : a
        ) {
            System.out.println(b);

        }
    }

    public static void main(String[] args) {
        m1(new int[]{11, 12, 24});

        int c[] = {1, 11, 111, 1111};
        m1(c);

    }

}

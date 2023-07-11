public class ArrayDemo {

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        System.out.println(a);//[I@1540e19d
        System.out.println(a[1]);//2
        System.out.println(a.length);//5
        System.out.println(a[a.length - 4]);//2
        // System.out.println(a[6]);//ArrayIndexOutOfBoundsException

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");//1 2 3 4 5


            System.out.println("a[" + i + "] = " + a[i]);
        }

        for (int x : a) {//retrieve elements from array
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("while loop");
        int i = 0;
        while (i < a.length) {
            System.out.print(a[i]);
            i++;

        }
        System.out.println();
        int j = 0;
        do {
            System.out.println(a[j]);
            j++;
            System.out.println(j);

        } while (j < a.length);


    }

}

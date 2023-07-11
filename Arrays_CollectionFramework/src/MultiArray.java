public class MultiArray {
    public static void main(String[] args) {

        int a[][] = new int[2][2];
        a[0][0]=0;
        a[0][1]=1;
         a[1][0]=2;
         //a[2][0]=3;
        System.out.println(a[1][0]);//2
        System.out.println(a[1][1]);//0

        int b[][] = new int[][]{{1, 2, 3, 4, 5}, {1, 2}};
        System.out.println(b);//[[I@1540e19d
        System.out.println(b[0]);//[I@677327b6
        System.out.println(b[0][0]);//1
        //System.out.println(b[0][6]);//AIOBE
        System.out.println(b.length);//2
        System.out.println(b[0].length);//5

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
            }
        }
        System.out.println("for each ");
        for (int d[] : b) {
            for (int e : d
            ) {
                System.out.println(e);

            }

        }


    }
}

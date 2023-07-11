public class ArrayDemo1 {


    public static void main(String[] args) {

        int []a=new int[5];
         a[0]=1;
         a[1]=2;

        System.out.println(a);//[I@1540e19d
        for(int x:a){
            System.out.print(x+" ");//1 2 0 0 0
        }

    }
}

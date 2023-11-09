public class ArrayDemo {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};//arr[0-]

        int []arr1=new int[5];

        arr1[0]=1;
        arr1[1]=12;
        arr1[2]=12;
        arr1[3]=12;arr1[4]=12;

      //  arr1[5]=10;

        System.out.println(arr1);//

        float f[]=new float[2];
        System.out.println(f);
        System.out.println(arr1[3]);//12
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
        ArrayDemo a=new ArrayDemo();
        System.out.println(a);


        int arr3[][]=new int[3][3];

        //2,3,3
        //rows--3
        int arr4[][]={{1,2},{1,2,3},{1,2,1}};
        //arr4[0],arr[1],arr[2]//arr4.lemngth=== 3

        //arr4[0]--- arr4[0],[0],arr4[0],[1] -- //2
        //arr4[]

        System.out.println(arr4[2][2]);//1
        System.out.println(arr4[1][2]);//3
        System.out.println(arr4[2][1]);//2


        System.out.println(arr4);
        System.out.println(arr4.length);//3
        System.out.println(arr4[1].length);//3



        for(int i=0;i<arr4.length;i++){
            for (int j=0;j< arr4[i].length;j++){
                System.out.print(arr4[i][j]);
            }

        }



    }


}

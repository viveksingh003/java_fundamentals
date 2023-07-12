public class TryCatchReturnDemo {

    int m1(){
        try {
            return 1;
        }catch (Exception e){
            return 2;
        }
        finally {
            return 3;
        }

    }

    public static void main(String[] args) {
        TryCatchReturnDemo demo=new TryCatchReturnDemo();
        int val=demo.m1();
        System.out.println(val);



    }
}
/*
3
 */
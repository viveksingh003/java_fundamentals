public class Q10 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            for(int j=10;j>=1;j--){
                if(i>=j){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}

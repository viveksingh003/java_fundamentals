public class StringPractice {
    public static void main(String[] args) {

        String s = new String("abc");
        System.out.println(s.getBytes());
        for (byte b : s.getBytes()
        ) {
            System.out.println(b);

        }

        System.out.println(s.toCharArray());
        for (int i = 0; i < s.length(); i++) {
            char c[] = s.toCharArray();
            System.out.println(c[i]);
        }

        String s1=new String("abc@123@def@456@ghi");
        System.out.println(s1.split("@"));

        String s2[]=s1.split("@");
        for (String s3:s2){
            System.out.println(s3);
        }

    }
}

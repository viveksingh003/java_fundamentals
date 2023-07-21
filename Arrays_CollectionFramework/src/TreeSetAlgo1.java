public class TreeSetAlgo1 {
    public static void main(String[] args) {


        System.out.println("FFF".compareTo("DDD"));//+ve
        // --> Check Right node , no right node make "FFF" as right node.

        System.out.println("AAA".compareTo("DDD")); //-ve
        // -->Check Left node , no left node make "AAA" as left node.

        System.out.println("CCC".compareTo("DDD"));//-ve
        // -->Check Left node , "AAA" is available at left node.
        System.out.println("CCC".compareTo("AAA"));//+ve
        // --> Check Right node , no right node make "CCC" as right node.
        System.out.println("EEE".compareTo("DDD"));//+ve
        // --> Check Right node , "FFF" is available at right node.
        System.out.println("EEE".compareTo("FFF"));//-ve
        // --> Check Left node , no left node make "EEE" as left node.
        System.out.println("BBB".compareTo("DDD"));//-ve
        // --> Check Left node , "AAA" is available at Left node.
        System.out.println("BBB".compareTo("AAA"));//+ve
        // --> Check Right node ,  "CCC" is available at Right node.
        System.out.println("BBB".compareTo("CCC"));//-ve
        // --> Check Left node , no left node make "BBB" as left node.


    }
}

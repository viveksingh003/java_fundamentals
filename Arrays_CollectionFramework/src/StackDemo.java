import java.util.ArrayList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        System.out.println(stack);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());//lifo --last element will get removed
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.search(2));//**2nd position


    }
}

import java.util.Stack;

public class check {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('(');
        stack.push(')');
        System.out.print(stack.peek());
        System.out.print(stack.pop());
        System.out.print(stack.peek());

    }

}
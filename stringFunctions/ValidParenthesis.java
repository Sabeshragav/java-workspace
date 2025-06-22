public class ValidParenthesis {
    // Using character array as manual stack
    boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false; // Odd length can't be valid

        char[] stack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                // Push operation
                stack[++top] = ch;
            } else {
                // Pop operation
                if (top == -1)
                    return false; // Stack empty

                char opening = stack[top--];
                if ((ch == ')' && opening != '(') ||
                        (ch == '}' && opening != '{') ||
                        (ch == ']' && opening != '[')) {
                    return false;
                }
            }
        }
        return top == -1; // Stack should be empty
    }

    public static void main(String[] args) {
        ValidParenthesis ob = new ValidParenthesis();

        System.out.println(ob.isValid("()"));
        System.out.println(ob.isValid("()[]{}"));
        System.out.println(ob.isValid("(]"));
        System.out.println(ob.isValid("([])"));

    }
}
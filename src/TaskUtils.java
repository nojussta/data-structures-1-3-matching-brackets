import java.util.Stack;

public class TaskUtils {
    public static boolean isBracketsIsMatch(String input) {

        Stack<Character> stack = new Stack<Character>();

        char symbol;
        for (int i = 0; i < input.length(); i++) {
            symbol = input.charAt(i);
            if (symbol == '(')
                stack.push(symbol);
            else if (symbol == '{')
                stack.push(symbol);
            else if (symbol == ')')
                if (stack.empty())
                    return false;
                else if (stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if (symbol == '}')
                if (stack.empty())
                    return false;
                else if (stack.peek() == '{')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();
    }
}

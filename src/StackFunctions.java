import java.util.Stack;

public class StackFunctions {
   public String reverseString(String str)
    {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray())
            stack.push(c);
        String reversed = "";
        while (!stack.isEmpty())
            reversed += stack.pop();
        return reversed;
    }

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '<' || ch == '[' || ch == '{')
                stack.push(ch);
            if (ch == ')' || ch == '>' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                var top = stack.pop();
                if (ch == ')' && top != '(') return false;
                if (ch == '>' && top != '<') return false;
                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }

}

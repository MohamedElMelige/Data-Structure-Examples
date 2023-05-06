public class Main {

    public static void main(String[] args) {
        String str = "abcd";
        var stack = new StackFunctions();
        System.out.println(stack.reverseString(str));
        System.out.println(stack.isBalanced("(<1+2>)"));
    }
}
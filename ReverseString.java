package Demo;
import java.util.Stack;
class ReverseString {
    static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str)); 
    }
}

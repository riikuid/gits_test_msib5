import java.util.Stack;

public class soal3 {
    public static String soalnomor3(String s) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (bracket == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (bracket == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return "NO";
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        
        String sample1 = "{[()]}";
        System.out.println("Output Sample 1: " + soalnomor3(sample1));
        
        String sample2 = "{[(])}";
        System.out.println("Output Sample 2: " + soalnomor3(sample2));
        
        String sample3 = "{(([])[])[]}";
        System.out.println("Output Sample 3: " + soalnomor3(sample3));
    }
}

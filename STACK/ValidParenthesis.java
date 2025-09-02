import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (s.isEmpty()) {
                    System.out.println("False");
                    return;
                }
                char top = s.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    System.out.println("False");
                    return;
                }
            }
        }
        
        String res = (s.isEmpty()) ? "True" : "False";
        System.out.println(res);
    }
}


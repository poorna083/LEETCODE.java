import java.util.Scanner;

class InnerreversePrefix {
    public String prefixReverse(String s, char c) {
        int idx = s.indexOf(c); 
        if (idx == -1) return s; 
        StringBuilder sb = new StringBuilder(s.substring(0, idx + 1));
        sb.reverse();
        sb.append(s.substring(idx + 1));
        return sb.toString();
    }
}

public class reversePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        InnerreversePrefix ip = new InnerreversePrefix();
        String result = ip.prefixReverse(s, c);
        System.out.println(result);
        sc.close();
    }
}

import java.util.Scanner;
 class InnerreversePrefix {
    public String prefixReverse(String s,char c){
        if (!s.contains(String.valueOf(c))) return s;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==c) {
                StringBuilder sb = new StringBuilder(s.substring(0, i + 1));
                sb.reverse();
                sb.append(s.substring(i + 1));   
                return sb.toString();
            }
        }
        return s;
    }
    
}

public class reversePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        InnerreversePrefix ip = new InnerreversePrefix();
        ip.prefixReverse(s, c);
    }
}

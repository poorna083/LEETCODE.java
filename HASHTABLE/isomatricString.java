import java.util.*;
 class InnerisomatricString {
    public boolean innerisometric(String s,String t){
        if(s.length()==t.length()||s.isEmpty()||t.isEmpty())return false;
        else if(s.length()==t.length()){
            char[] s2t = new char[256];
        char[] t2s = new char[256];
        Arrays.fill(s2t, (char)0);
        Arrays.fill(t2s, (char)0);

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (s2t[cs] == 0 && t2s[ct] == 0) {
                s2t[cs] = ct;
                t2s[ct] = cs;
            } else {
                if (s2t[cs] != ct || t2s[ct] != cs) return false;
            }
        }
        }return true;
    }
    
}

public class isomatricString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        InnerisomatricString i = new InnerisomatricString();
        i.innerisometric(s, t);
        sc.close();
    }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class ovealsort{
    public String ovealSorting(String s) {
        fint n = s.length();
        ArrayList<Character> vow = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') { 
                vow.add(ch);
                pos.add(i); 
            }
        }  
        Collections.sort(vow);
        char[] answer = s.toCharArray();
        for (int i = 0; i < pos.size(); i++) {
            answer[pos.get(i)] = vow.get(i);
        }
        
        return new String (answer);
    }
}
public class sortOvealinstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ovealsort os = new ovealsort();
        System.out.println(os.ovealSorting(s));
    }
}

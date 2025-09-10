import java.util.Scanner;
 class InnerisomatricString {
    public boolean innerisometric(String s,String t){
        if(s.length()==t.length()||s.isEmpty()||t.isEmpty())return false;
        
    }return true;
    
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

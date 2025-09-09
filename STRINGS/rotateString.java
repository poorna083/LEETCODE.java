import java.util.*;
class rotatestr{
    public boolean rotatstr(String s,String goal){
        if(s.length()!=goal.length())return false;
        else if(s.length()==goal.length()){
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < goal.length(); j++) {
                    if (s.charAt(i)==goal.charAt(i)) {
                        
                    }
                }
            }
            
        }
    }
}
public class rotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String goal = sc.nextLine();
        rotatestr rs = new rotatestr();
        System.out.println(rs.rotatstr(s, goal));
    }
}

import java.util.*;
class rotatestr{
    public boolean rotatstr(String s,String goal){
        if(s.length()!=goal.length())return false;
        if(s.contentEquals(goal)){
            
        }
    }return true;
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
